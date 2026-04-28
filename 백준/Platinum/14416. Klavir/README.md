# [Platinum I] Klavir - 14416

[문제 링크](https://www.acmicpc.net/problem/14416)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 47, 정답: 19, 맞힌 사람: 14, 정답 비율: 51.852%

### 분류

조합론, 다이나믹 프로그래밍, KMP, 수학, 문자열

### 문제 설명

<p>Young Alisa likes to play the piano using only one finger. Unfortunately, Alisa never learned to play the piano, so her playing is entirely random. More precisely, any time she chooses a tone to play, she does it independently of all previous tones, and chooses each of the N tones with the same probability.</p>

<p>Her good friend Mirta wants to listen to a composition containing M consecutive tones, but since Alisa plays the piano randomly, Mirta does not know how long she will have to wait to hear an array of exactly these M tones. Help Mirta determine the expected number of key presses in order to hear, for the first time, her wanted array of consecutive tones. Moreover, since Mirta is a very curious girl, she also wants to know the expected number of key presses for each prefix of her wanted array of tones.</p>

### 입력

<p>The first line of input contains the positive integer N, the number of different piano tones (1 &le; N &le; 100).<br />
The second line of input contains the positive integer M, the length of the wanted array (1 &le; M &le; 10<sup>6</sup> ).<br />
The third line of input contains the array of M positive integers between 1 and N.</p>

<p>&lt;Scoring&gt;</p>

<p>In test cases worth 64 points in total, it will hold 1 &le; M &le; 200.</p>

### 출력

<p>The i th of the following M lines must contain the expected number of key presses in order for Mirta to hear the prefix of length i of her wanted array of tones, modulo​ 10<sup>9</sup> + 7.<br />
The test data will be such that the expected number of key presses will always be an integer.</p>