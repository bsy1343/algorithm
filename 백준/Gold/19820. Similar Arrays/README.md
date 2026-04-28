# [Gold I] Similar Arrays - 19820

[문제 링크](https://www.acmicpc.net/problem/19820)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 35, 정답: 25, 맞힌 사람: 22, 정답 비율: 68.750%

### 분류

그래프 이론, 해 구성하기

### 문제 설명

<p>Vasya had an array of $n$ integers, each element of the array was from $1$ to $n$. He chose $m$ pairs of different positions and wrote them down to a sheet of paper. Then Vasya compared the elements at these positions, and wrote down the results of the comparisons to another sheet of paper. For each pair he wrote either &quot;greater&quot;, &quot;less&quot;, or &quot;equal&quot;.</p>

<p>After several years, he has found the first sheet of paper, but he couldn&#39;t find the second one. Also he doesn&#39;t remember the array he had. In particular, he doesn&#39;t remember if the array had equal elements. He has told this sad story to his informatics teacher Dr Helen.</p>

<p>She told him that it could be the case that even if Vasya finds his second sheet, he would still not be able to find out whether the array had two equal elements.&nbsp;</p>

<p>Now Vasya wants to find two arrays of integers, each of length $n$. All elements of the first array must be distinct, and there must be two equal elements in the second array. For each pair of positions Vasya wrote at the first sheet of paper, the result of the comparison must be the same for the corresponding elements of the first array, and the corresponding elements of the second array.&nbsp;</p>

<p>Help Vasya find two such arrays of length $n$, or find out that there are no such arrays for his sets of pairs.</p>

### 입력

<p>The first line of input contains two integers $n$, $m$ --- the number of elements in the array and number of comparisons made by Vasya ($1 \le n \le 100\,000$, $0 \le m \le 100\,000$).</p>

<p>Each of the following $m$ lines contains two integers $a_i$, $b_i$ --- the positions of the $i$-th comparison ($1 \le a_i, b_i \le n$; $a_i \ne b_i$). It&#39;s guaranteed that any unordered pair is given in the input at most once.</p>

### 출력

<p>The first line of output must contain &quot;<code>YES</code>&quot; if there exist two arrays, such that the results of comparisons would be the same, and all numbers in the first one are distinct, and the second one contains two equal numbers. Otherwise it must contain &quot;<code>NO</code>&quot;.</p>

<p>If the arrays exist, the second line must contain the array of distinct integers, &nbsp;the third line must contain the array, that contains at least one pair of equal elements. Elements of the arrays must be integers from $1$ to $n$.</p>