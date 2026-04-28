# [Platinum II] Dictionary - 16838

[문제 링크](https://www.acmicpc.net/problem/16838)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 53, 정답: 21, 맞힌 사람: 15, 정답 비율: 40.541%

### 분류

조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>Snuke&rsquo;s dictionary contains n distinct words s<sub>1</sub>, . . . , s<sub>n</sub>. Each word consists of English lowercase letters. The words are sorted lexicographically, i.e., s<sub>1</sub> &lt; &middot; &middot; &middot; &lt; s<sub>n</sub>. Unfortunately, you can&rsquo;t read some characters in his dictionary. You replaced those characters with &rsquo;?&rsquo;. Compute the number of ways to replace each &rsquo;?&rsquo; with an English lowercase letter and make a valid dictionary, modulo 1,000,000,007.</p>

### 입력

<p>First line of the input contains one integer n (1 &le; n &le; 50). Then n lines follow, i&rsquo;th of then contains word s<sub>i</sub> (1 &le; |s<sub>i</sub>| &le; 20, each character in s<sub>i</sub> is an English lowercase letter or a &lsquo;?&rsquo;).</p>

### 출력

<p>Print the answer.</p>