# [Platinum III] Deblo - 16752

[문제 링크](https://www.acmicpc.net/problem/16752)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 20, 맞힌 사람: 17, 정답 비율: 50.000%

### 분류

수학, 다이나믹 프로그래밍, 트리, 조합론, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>About thirty years ago, young Kre&scaron;o participated for the first time in the national informatics competition. Similar to today, the opening of the competition consisted of a series of speakers who tried to demonstrate the importance of this event to the contestants through motivational messages. The audience, with enthusiasm, began applauding every couple of seconds, but Kre&scaron;o was irritated by one sentence. Namely, one of the speakers claimed he was more appreciative of the logical operation AND than the logical operation OR because, regardless of the winner&rsquo;s identity, to him both Mirko and Slavko were winners of the national competition, instead of the winner being Mirko or Slavko. Kre&scaron;o went mad, got up and started explaining to the audience that this is an operation known as exclusive OR (popular XOR). After having given his lecture, he gave the distinguished speaker the next task to verify his understanding.</p>

<p>There is a given tree consisting of N nodes, where each node is assigned a value. The value of a path on that tree is defined as the exclusive OR of all nodes&rsquo; values on that path. Your task is to determine the sum of the values of all paths of the tree, including paths containing only one node.</p>

<p>Thirty years later, Kre&scaron;o has finally persuaded the authors of the COCI tasks to include this task in one of the rounds. Help us return Kre&scaron;o&rsquo;s faith in the future of competitive programming.</p>

### 입력

<p>The first line contains a positive integer N (1 &le; N &le; 100 000) that denotes the number of nodes in the tree.</p>

<p>The second line contains N integers v<sub>i</sub> (0 &le; v<sub>i</sub> &le; 3 000 000) separated by space, i<sup>th</sup> value representing the value of the i<sup>th</sup> node.</p>

<p>The following (N-1) lines contain two numbers a<sub>j</sub> and b<sub>j</sub> (1 &le; a<sub>j</sub>, b<sub>j</sub> &le; N) that indicate that there is an edge between the nodes a<sub>j</sub> and b<sub>j</sub>.</p>

### 출력

<p>Print the required sum of values for all tree paths.</p>

### 힌트

<p>Exclusive OR (&oplus;) is a binary operation that is applied separately on each pair of corresponding bits of its two operands so that some bit in the result is set to 1 if and only if that bit in exactly one operand is set to 1.</p>