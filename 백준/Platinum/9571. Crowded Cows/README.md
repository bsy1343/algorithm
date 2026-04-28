# [Platinum V] Crowded Cows - 9571

[문제 링크](https://www.acmicpc.net/problem/9571)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 460, 정답: 237, 맞힌 사람: 187, 정답 비율: 54.203%

### 분류

자료 구조, 세그먼트 트리, 집합과 맵, 트리를 사용한 집합과 맵, 두 포인터

### 문제 설명

<p>Farmer John&apos;s N cows (1 &lt;= N &lt;= 50,000) are grazing along a one-dimensional fence.  Cow i is standing at location x(i) and has height h(i) (1 &lt;= x(i),h(i) &lt;= 1,000,000,000).</p><p>A cow feels &quot;crowded&quot; if there is another cow at least twice her height within distance D on her left, and also another cow at least twice her height within distance D on her right (1 &lt;= D &lt;= 1,000,000,000).  Since crowded cows produce less milk, Farmer John would like to count the number of such cows.  Please help him.</p>

### 입력

<ul><li>Line 1: Two integers, N and D.</li><li>Lines 2..1+N: Line i+1 contains the integers x(i) and h(i).  The locations of all N cows are distinct.</li></ul>

### 출력

<ul><li>Line 1: The number of crowded cows.</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 6 cows, with a distance threshold of 4 for feeling crowded.  Cow #1 lives at position x=10 and has height h=3, and so on.</p><h4>Output Details</h4><p>The cows at positions x=5 and x=6 are both crowded.</p>