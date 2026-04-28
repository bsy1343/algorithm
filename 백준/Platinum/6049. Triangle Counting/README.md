# [Platinum III] Triangle Counting - 6049

[문제 링크](https://www.acmicpc.net/problem/6049)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 51, 정답: 31, 맞힌 사람: 19, 정답 비율: 51.351%

### 분류

수학, 구현, 자료 구조, 정렬, 기하학, 조합론, 스위핑, 트리를 사용한 집합과 맵, 두 포인터, 각도 정렬

### 문제 설명

<p>Bessie is standing guard duty after the big bad wolf was spotted stalking cows over at Farmer Don&#39;s spread. Looking down from her guard tower in utter boredom, she&#39;s decided to perform intellectual exercises in order to keep awake.</p>

<p>After imagining the field as an X,Y grid, she recorded the coordinates of the N (1 &lt;= N &lt;= 100,000) conveniently numbered 1..N cows as X_i,Y_i (-100,000 &lt;= X_i &lt;= 100,000; -100,000 &lt;= Y_i &lt;= 100,000; 1 &lt;= i &lt;= N). She then mentally formed all possible triangles that could be made from subsets of the entire set of cow coordinates. She counts a triangle as &#39;golden&#39; if it wholly contains the origin (0,0). The origin does not fall on the line between any pair of cows. Additionally, no cow is standing exactly on the origin.</p>

<p>Given the list of cow locations, calculate the number of &#39;golden&#39; triangles that contain the origin so Bessie will know if she&#39;s doing a good job.</p>

<p>By way of example, consider 5 cows at these locations:</p>

<pre>
             -5,0   0,2   11,2   -11,-6   11,-5</pre>

<p>Below is a schematic layout of the field from Betsy&#39;s point of view:</p>

<pre>
          ............|............
          ............*..........*.
          ............|............
          -------*----+------------
          ............|............
          ............|............
          ............|............
          ............|............
          ............|..........*.
          .*..........|............
          ............|............</pre>

<p>All ten triangles below can be formed from the five points above:</p>

<p>By inspection, 5 of them contain the origin and hence are &#39;golden&#39;.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Each line contains two integers, the coordinates of a single cow: X_i and Y_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single line with a single integer that is the count of the number of times a triangle formed by the cow locations contains the origin</li>
</ul>

<p>&nbsp;</p>