# [Gold IV] CARDS - 3292

[문제 링크](https://www.acmicpc.net/problem/3292)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 19, 맞힌 사람: 19, 정답 비율: 79.167%

### 분류

브루트포스 알고리즘, 다이나믹 프로그래밍

### 문제 설명

<p>Dave&rsquo;s little son Maverick likes to play card games, but being only four years old, he always lose when playing with his older friends. Also, arranging cards in his hand is quite a problem to him. When Maverick gets his cards, he has to arrange them in groups so that all the cards in a group are of the same color. Next, he has to sort the cards in each group by their value &ndash; card with lowest value should be the leftmost in its group. Of course, he has to hold all the cards in his hand all the time.</p>

<p>He has to arrange his cards as quickly as possible, i.e. making as few moves as possible. A move consists of changing a position of one of his cards.</p>

<p>Write a program that will calculate the lowest number of moves needed to arrange cards.</p>

### 입력

<p>The first line of input file contains two integers C, number of colors (1 &le; C &le; 4), and N, number of cards of the same color (1 &le; N &le; 100), separated by a space character.&nbsp;</p>

<p>Each of the next C*N lines contains a pair of two integers X and Y, 1 &le; X &le; C, 1 &le; Y &le; N, separated by a space character. Numbers in each of those lines determine a color (X) and a value (Y) of a card dealt to little Maverick. The order of lines corresponds to the order the cards were dealt to little Maverick.</p>

<p>No two lines describe the same card.</p>

### 출력

<p>The first and only line of output file should contain the lowest number of moves needed to arrange the cards as described above.</p>