# [Silver V] PJESMA - 8975

[문제 링크](https://www.acmicpc.net/problem/8975)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 270, 정답: 204, 맞힌 사람: 178, 정답 비율: 78.761%

### 분류

자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>&quot;Guess the song&quot; is a popular game among young programmers in Croatia. It is a game of skill, wisdom and patience. The game host plays a song so that all players hear it. The players&#39; goal is to guess the title of the song as fast as possible.&nbsp;</p>

<p>Mirko may not be much of a programmer, but he is a world class song-guesser. Mirko always guesses the song at the moment when at least half of the words in the title of the song have been said in the lyrics. All words in the song title are unique (no word will occur two or more times).&nbsp;</p>

<p>Write a program that, given the song title and its lyrics, determines at which point during the song (after how many words) Mirko guesses the title.&nbsp;</p>

### 입력

<p>The first line contains an integer N, 1 &le; N &le; 50, the number of words in the song title.&nbsp;</p>

<p>Each of the following N lines contains one word in the song title.&nbsp;</p>

<p>The next line contains an integer M, 1 &le; M &le; 10 000, the number of words in the lyrics.&nbsp;</p>

<p>Each of the following M lines contains one word of the lyrics.&nbsp;</p>

<p>All words in the title and lyrics will consist of between 1 and 15 lowercase English letters.&nbsp;</p>

<p>Note: the test data will be such that Mirko will always guess the song title from the lyrics.&nbsp;</p>

### 출력

<p>Output the number of words in the song lyrics after which Mirko guesses the title.&nbsp;</p>