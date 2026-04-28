# [Bronze I] Hoof, Paper, Scissors (Bronze) - 14456

[문제 링크](https://www.acmicpc.net/problem/14456)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 984, 정답: 622, 맞힌 사람: 550, 정답 비율: 63.805%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>You have probably heard of the game &quot;Rock, Paper, Scissors&quot;. The cows like to play a similar game they call &quot;Hoof, Paper, Scissors&quot;.</p>

<p>The rules of &quot;Hoof, Paper, Scissors&quot; are simple. Two cows play against each-other. They both count to three and then each simultaneously makes a gesture that represents either a hoof, a piece of paper, or a pair of scissors. Hoof beats scissors (since a hoof can smash a pair of scissors), scissors beats paper (since scissors can cut paper), and paper beats hoof (since the hoof can get a papercut). For example, if the first cow makes a &quot;hoof&quot; gesture and the second a &quot;paper&quot; gesture, then the second cow wins. Of course, it is also possible to tie, if both cows make the same gesture.</p>

<p>Farmer John watches in fascination as two of his cows play a series of&nbsp;N&nbsp;games of &quot;Hoof, Paper, Scissors&quot; (1 &le; N &le; 100). Unfortunately, while he can see that the cows are making three distinct types of gestures, he can&#39;t tell which one represents &quot;hoof&quot;, which one represents &quot;paper&quot; and which one represents &quot;scissors&quot; (to Farmer John&#39;s untrained eye, they all seem to be variations on &quot;hoof&quot;...)</p>

<p>Not knowing the meaning of the three gestures, Farmer John assigns them numbers 1, 2, and 3. Perhaps gesture 1 stands for &quot;hoof&quot;, or maybe it stands for &quot;paper&quot;; the meaning is not clear to him. Given the gestures made by both cows over all&nbsp;N games, please help Farmer John determine the maximum possible number of games the first cow could have possibly won, given an appropriate mapping between numbers and their respective gestures.</p>

### 입력

<p>The first line of the input file contains&nbsp;N.</p>

<p>Each of the remaining&nbsp;N&nbsp;lines contain two integers (each 1, 2, or 3), describing a game from Farmer John&#39;s perspective.</p>

### 출력

<p>Print the maximum number of games the first of the two cows could possibly have won.</p>

### 힌트

<p>One solution (of several) for this sample case is to have 1 represent &quot;scissors&quot;, 2 represent &quot;hoof&quot;, and 3 represent &quot;paper&quot;. This assignment gives 2 victories to the first cow (&quot;1 3&quot; and &quot;3 2&quot;). No other assignment leads to more victories.</p>