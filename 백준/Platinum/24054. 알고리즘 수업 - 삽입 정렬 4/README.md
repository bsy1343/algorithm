# [Platinum IV] 알고리즘 수업 - 삽입 정렬 4 - 24054

[문제 링크](https://www.acmicpc.net/problem/24054)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 311, 정답: 87, 맞힌 사람: 58, 정답 비율: 43.609%

### 분류

자료 구조, 정렬, 세그먼트 트리, 값 / 좌표 압축

### 문제 설명

<p>오늘도 서준이는 삽입 정렬&nbsp;수업 조교를 하고 있다.&nbsp;아빠가 수업한&nbsp;내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.</p>

<p><em>N</em>개의 서로 다른 양의&nbsp;정수가 저장된&nbsp;배열 A가 있다. 삽입 정렬로 배열 A를 오름차순 정렬할 경우&nbsp;<em>K&nbsp;</em>번째 저장되는 수를 구하자.</p>

<p><em>N</em>이 매우 커서 시간 초과를 고민하고 있는 우리 서준이를 도와주자.</p>

<p>크기가&nbsp;<em>N</em>인 배열에 대한&nbsp;삽입 정렬&nbsp;의사 코드는&nbsp;다음과 같다.</p>

<pre>
insertion_sort(A[1..N]) { # A[1..N]을 오름차순 정렬한다.
    for i &lt;- 2 to N {
&nbsp;       loc = i - 1;
&nbsp;       newItem = A[i];

&nbsp;       # 이 지점에서 A[1..i-1]은 이미 정렬되어 있는 상태
&nbsp;       while (1 &le; loc and newItem &lt; A[loc]) {
            A[loc + 1] &lt;- A[loc];
&nbsp;           loc--;
&nbsp;       }
&nbsp;       if (loc + 1 != i) then A[loc + 1] = newItem;
&nbsp;   }
}</pre>

### 입력

<p>첫째 줄에 배열 A의 크기&nbsp;<em>N</em>(5&nbsp;&le;&nbsp;<em>N</em>&nbsp;&le; 500,000), 저장&nbsp;횟수&nbsp;<em>K</em>(1 &le;&nbsp;<em>K</em>&nbsp;&le; 10<sup>12</sup>)가&nbsp;주어진다.</p>

<p>다음&nbsp;줄에 서로 다른 배열 A의 원소 A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>이 주어진다.&nbsp;(1&nbsp;&le; A<sub>i</sub>&nbsp;&le; 10<sup>9</sup>)</p>

### 출력

<p><em>K&nbsp;</em>번째 저장 되는&nbsp;수를 출력한다. 저장 횟수가&nbsp;<em>K&nbsp;</em>보다 작으면 -1을 출력한다.</p>