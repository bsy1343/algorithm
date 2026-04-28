# [Silver III] Bovine Math Geniuses - 27055

[문제 링크](https://www.acmicpc.net/problem/27055)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 16 MB

### 통계

제출: 33, 정답: 21, 맞힌 사람: 20, 정답 비율: 62.500%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Farmer John loves to help the cows further their mathematical skills. He has promised them Hay-flavored ice cream if they can solve various mathematical problems.</p>

<p>He said to Bessie, &quot;Choose a six digit integer, and tell me what it is. Then extract the middle four digits. Square them and discard digits at the top until you have another number six digits or shorter. Tell me the result.&quot;</p>

<p>Bessie, a mathematical genius in disguise, chose the six digit number 655554. &quot;Moo: 6 5 5 5 5 4&quot;, she said. She then extracted the middle four digits: 5555 and squared them: 30858025. She kept only the bottom six digits: 858025. &quot;Moo: 8 5 8 0 2 5&quot;, she replied to FJ.</p>

<p>FJ nodded wisely, acknowledging Bessie&#39;s prowess in arithmetic. &quot;Now keep doing that until you encounter a number that repeats a number already seen,&quot; he requested.</p>

<p>Bessie decided she&#39;d better create a table to keep everything straight:</p>

<pre>
              Middle    Middle   Shrunk to
       Num   4 digits   square   6 or fewer
     655554    5555    30858025    858025
     858025    5802    33663204    663204
     663204    6320    39942400    942400
     942400    4240    17977600    977600
     977600    7760    60217600    217600 &lt;-+
     217600    1760     3097600     97600   |
      97600    9760    95257600    257600   |
     257600    5760    33177600    177600   |
     177600    7760    60217600    217600 --+</pre>

<p>Bessie showed her table to FJ who smiled and produced a big dish of delicious hay ice cream. &quot;That&#39;s right, Bessie,&quot; he praised. &quot;The chain repeats in a loop of four numbers, of which the first encountered was 217600. The loop was detected after nine iterations.&quot;</p>

<p>Help the other cows win ice cream treats. Given a six digit number, calculate the total number of iterations to detect a loop, the first looping number encountered, and also the length of the loop.</p>

<p>FJ wondered if Bessie knew all the tricks. He had made a table to help her, but she never asked:</p>

<pre>
              Middle    Middle   Shrunk to
       Num   4 digits   square   6 or fewer
     200023    0002       4        4
          4       0       0        0
          0       0       0        0         [a self-loop]</pre>

<p>whose results would be: three iterations to detect a loop, looping on 0, and a length of loop equal to 1.</p>

<p>Remember: Your program can use no more than 16MB of memory.</p>

### 입력

<ul>
	<li>Line 1: A single six digit integer that is the start of the sequence testing.</li>
</ul>

### 출력

<ul>
	<li>Line 1: Three space-separated integers: the first number of a loop, the length of the loop, and the minimum number of iterations to detect the loop.</li>
</ul>