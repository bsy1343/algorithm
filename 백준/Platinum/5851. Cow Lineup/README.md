# [Platinum III] Cow Lineup - 5851

[문제 링크](https://www.acmicpc.net/problem/5851)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 158, 정답: 84, 맞힌 사람: 74, 정답 비율: 54.015%

### 분류

자료 구조, 집합과 맵, 트리를 사용한 집합과 맵, 두 포인터

### 문제 설명

<p>Farmer John&apos;s N cows (1 &lt;= N &lt;= 100,000) are lined up in a row.  Each cow is identified by an integer &quot;breed ID&quot; in the range 0...1,000,000,000; the breed ID of the ith cow in the lineup is B(i).  Multiple cows can share the same breed ID.</p><p>FJ thinks that his line of cows will look much more impressive if there is a large contiguous block of cows that all have the same breed ID.  In order to create such a block, FJ chooses up to K breed IDs and removes from his lineup all the cows having those IDs.  Please help FJ figure out the length of the largest consecutive block of cows with the same breed ID that he can create by doing this.</p>

### 입력

<ul><li>Line 1: Two space-separated integers: N and K.</li><li>Lines 2..1+N: Line i+1 contains the breed ID B(i).</li></ul>

### 출력

<ul><li>Line 1: The largest size of a contiguous block of cows with identical breed IDs that FJ can create.</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 9 cows in the lineup, with breed IDs 2, 7, 3, 7, 7, 3, 7, 5, 7. FJ would like to remove up to 1 breed ID from this lineup.</p><h4>Output Details</h4><p>By removing all cows with breed ID 3, the lineup reduces to 2, 7, 7, 7, 7, 5, 7.  In this new lineup, there is a contiguous block of 4 cows with the same breed ID (7).</p>