# [Platinum V] Escape Room - 15403

[문제 링크](https://www.acmicpc.net/problem/15403)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 148, 정답: 121, 맞힌 사람: 103, 정답 비율: 87.288%

### 분류

그리디 알고리즘, 애드 혹

### 문제 설명

<p>As you know, escape rooms became very popular since they allow you to play the role of a video game hero. One such room has the following quiz. You know that the locker password is a permutation of N numbers. A permutation of length N is a sequence of distinct positive integers, whose values are at most N. You got the following hint regarding the password - the length of the longest increasing subsequence starting at position i equals A<sub>i</sub>. Therefore you want to find the password using these values. As there can be several possible permutations you want to find the lexicographically smallest one. Permutation P is lexicographically smaller than permutation Q if there is an index i such that P<sub>i</sub> &lt; Q<sub>i</sub> and P<sub>j</sub> = Q<sub>j</sub> for all j &lt; i. It is guaranteed that there is at least one possible permutation satisfying the above constraints. Can you open the door?</p>

### 입력

<p>The first line of the input contains one integer N (1 &le; N &le; 10<sup>5</sup>).</p>

<p>The next line contains N space-separated integer A<sub>i</sub> (1 &le; A<sub>i</sub> &le; N).</p>

<p>It&rsquo;s guaranteed that at least one possible permutation exists.&nbsp;</p>

### 출력

<p>Print in one line the lexicographically smallest permutation that satisfies all the conditions.</p>