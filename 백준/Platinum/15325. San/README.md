# [Platinum III] San - 15325

[문제 링크](https://www.acmicpc.net/problem/15325)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 132, 정답: 51, 맞힌 사람: 44, 정답 비율: 41.509%

### 분류

이분 탐색, 중간에서 만나기

### 문제 설명

<p>Have you ever dreamt that you were the main character in a computer game? The protagonist of this story, Branimir, is having that dream right now.</p>

<p>The world in Branimir&rsquo;s dream consists of N skyscrapers ordered from left to right. For the i th skyscraper, we know the height Hi and the number of gold coins Gi on the roof of the skyscraper. The game begins with a jump on any of the skyscrapers and consists of several steps. In each step, Branimir can jump on a skyscraper to the right from the one he&rsquo;s currently on (it is possible for him to jump over a couple of them too) and if it is not lower than the current one. On each skyscraper roof he&rsquo;s on, Branimir will collect all the gold coins. Branimir can end the game after any number of steps (zero as well), but he must collect at least K gold coins in order to advance to the next level.</p>

<p>Branimir wants to know the number of different ways for him to play the game in order to advance to the next level. Two games are played in different ways if there is a skyscraper that was visited in one game, and not in the other.</p>

### 입력

<p>The first line of input contains positive integers N (1 &le; N &le; 40) and K (1 &le; K &le; 4 &middot; 10<sup>10</sup>), the numbers from the task.</p>

<p>The i th of the following N lines contains two positive integers, H<sub>i</sub> and G<sub>i</sub> (1 &le; H<sub>i</sub>, G<sub>i</sub> &le; 10<sup>9</sup>), the numbers from the task.</p>

### 출력

<p>You must output the number of different ways to play the game from the task.</p>

### 힌트

<p>Clarification​ ​of​ ​the​ ​first​ ​test​ ​case: The following three games will take Branimir to the next level (the numbers represent the labels of the skyscrapers he visited): {1, 2, 3}, {1, 4} and {4}.</p>