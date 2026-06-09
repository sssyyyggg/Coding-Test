import java.util.*;

class Solution {

    static class Song {
        int id;   // 고유 번호를 저장할 변수
        int play; // 재생 횟수를 저장할 변수

        Song(int id, int play) {
            this.id = id;     // 입력받은 id를 변수에 저장
            this.play = play; // 입력받은 play를 변수에 저장
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        
        Map<String, Integer> genrePlayMap = new HashMap<>(); 
        
        Map<String, List<Song>> genreSongMap = new HashMap<>(); 

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i]; // i번째 노래의 장르 이름 
            int play = plays[i];      // i번째 노래의 재생 횟수 

            genrePlayMap.put(genre, genrePlayMap.getOrDefault(genre, 0) + play);

            if (!genreSongMap.containsKey(genre)) {
                genreSongMap.put(genre, new ArrayList<>());
            }
            
            genreSongMap.get(genre).add(new Song(i, play));
        }

        List<String> sortedGenres = new ArrayList<>(genrePlayMap.keySet());
        
        sortedGenres.sort((g1, g2) -> genrePlayMap.get(g2) - genrePlayMap.get(g1));

        List<Integer> answerList = new ArrayList<>();

        for (String genre : sortedGenres) {

            List<Song> songs = genreSongMap.get(genre);

            songs.sort(Comparator.comparingInt((Song s) -> s.play).reversed()
                    .thenComparingInt(s -> s.id));

            answerList.add(songs.get(0).id);
            
            if (songs.size() > 1) {
                answerList.add(songs.get(1).id);
            }
        }

        return answerList.stream().mapToInt(i -> i).toArray();
    }
}