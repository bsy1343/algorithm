# [Gold IV] Scrambled Letters - 5867

[문제 링크](https://www.acmicpc.net/problem/5867)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 123, 정답: 91, 맞힌 사람: 75, 정답 비율: 70.755%

### 분류

그리디 알고리즘, 정렬, 이분 탐색

### 문제 설명

<p>Farmer John keeps an alphabetically-ordered list of his N cows (1 &lt;= N &lt;= 50,000) taped to the barn door.  Each cow name is represented by a distinct string of between 1 and 20 lower-case characters.</p><p>Always the troublemaker, Bessie the cow alters the list by re-ordering the cows on the list.  In addition, she also scrambles the letters in each cow&apos;s name.  Given this modified list, please help Farmer John compute, for each entry in the list, the lowest and highest positions at which it could have possibly appeared in the original list.</p>

### 입력

<ul><li>Line 1: A single integer N.</li><li>Lines 2..1+N: Each of these lines contains the re-ordered name of some cow.</li></ul>

### 출력

<ul><li>Lines 1..N: Line i should specify, for input string i, the lowest and highest positions in Farmer John&apos;s original list the original version of string i could have possibly appeared.</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 4 cows, with re-ordered names given above.</p><h4>Output Details</h4><p>The string &quot;a&quot; would have appeared first on FJ&apos;s list no matter what, and similarly the string &quot;xzy&quot; would have appeared last no matter how its letters were originally ordered.  The two strings &quot;essieb&quot; and &quot;elsie&quot; could have both occupied either positions 2 or 3, depending on their original letter orderings (for example, &quot;bessie&quot; (position 2) and &quot;elsie&quot; (position 3), versus &quot;sisbee&quot; (position 3) and &quot;ilees&quot; (position 2)).</p>