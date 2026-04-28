# [Silver I] Saruman’s army - 7676

[문제 링크](https://www.acmicpc.net/problem/7676)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 173, 정답: 104, 맞힌 사람: 95, 정답 비율: 59.748%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Saruman the White must lead his army along a straight path from Isengard to Helm&rsquo;s Deep. To keep track of his forces, Saruman distributes seeing stones, known as palantirs, among the troops. Each palantir has a maximum effective range of R units, and must be carried by some troop in the army (i.e., palantirs are not allowed to &ldquo;free float&rdquo; in mid-air). Help Saruman take control of Middle Earth by determining the minimum number of palantirs needed for Saruman to ensure that each of his minions is within R units of some palantir.</p>

### 입력

<p>The input test file will contain multiple cases. Each test case begins with a single line containing an integer R, the maximum effective range of all palantirs (where 0 &le; R &le; 1000), and an integer n, the number of troops in Saruman&rsquo;s army (where 1 &le; n &le; 1000). The next line contains n integers, indicating the positions x<sub>1</sub>, . . ., x<sub>n</sub> of each troop (where 0 &le; x<sub>i</sub> &le; 1000). The end-of-file is marked by a test case with R = n = &minus;1.</p>

### 출력

<p>For each test case, print a single integer indicating the minimum number of palantirs needed.</p>

### 힌트

<p>In the first test case, Saruman may place a palantir at positions 10 and 20. Here, note that a single palantir with range 0 can cover both of the troops at position 20.</p>

<p>In the second test case, Saruman can place palantirs at position 7 (covering troops at 1, 7, and 15), position 20 (covering positions 20 and 30), position 50, and position 70. Here, note that palantirs must be distributed among troops and are not allowed to &ldquo;free float.&rdquo; Thus, Saruman cannot place a palantir at position 60 to cover the troops at positions 50 and 70.</p>