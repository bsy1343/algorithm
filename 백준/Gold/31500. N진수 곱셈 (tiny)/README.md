# [Gold II] N진수 곱셈 (tiny) - 31500

[문제 링크](https://www.acmicpc.net/problem/31500)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 421, 정답: 135, 맞힌 사람: 70, 정답 비율: 26.415%

### 분류

수학, 구현, 문자열, 정수론, 파싱

### 문제 설명

<p><strong>이 문제는 <a href="/problem/31505">N진수 곱셈 (HUGE)</a>와 $A$와 $B$의 길이 제한만 다른 문제이다.</strong></p>

<p>$N$진법으로 표현된 두 정수 $A$, $B$를 곱하는 프로그램을 작성하자.</p>

<p>$A$와 $B$를 표현할 때 각 자리의 수는 ASCII 순서대로 배치하는데, $0$은 $33$번에 해당하는 문자인 <span data-darkreader-inline-color="" style="color: rgb(231, 76, 60); --darkreader-inline-color: #e95849;"><code>!</code></span>로, $1$은 $34$번에 해당하는 문자인 <span data-darkreader-inline-color="" style="color: rgb(231, 76, 60); --darkreader-inline-color: #e95849;"><code>&quot;</code></span>로, ..., $i$는 $33+i$번에 해당하는 문자로 표현한다. 음수를 표현하는 문자는 <span data-darkreader-inline-color="" style="color: rgb(231, 76, 60); --darkreader-inline-color: #e95849;"><code>~</code></span>(ASCII 코드 $126$번)로 $N$이 양수일 때만, 맨 앞 글자에 최대 한 번 나타난다.</p>

<p style="display:flex;flex-direction:row;justify-content:center;"><img alt="" src="https://upload.acmicpc.net/ee57228d-0139-45f4-bd9a-dcbea16aa710/-/preview/" style="width: 720px; height: 407px;" /></p>

<p style="display:flex;flex-direction:row;justify-content:center;">각 자리를 표기하기 위한 ASCII 문자 대응표</p>

<p> 아래는 앞에서 서술한 대로 수를 표현한 예시이다. 이해를 돕기 위해 각 자리의 숫자를 대괄호를 감싸 표기하였다.</p>

<p>$[1][2][5]_{(10)}=$<span data-darkreader-inline-color="" style="color: rgb(231, 76, 60); --darkreader-inline-color: #e95849;"><code>&quot;#&amp;</code></span></p>

<p>$-[1][2][16]_{(27)}=$<span data-darkreader-inline-color="" style="color: rgb(231, 76, 60); --darkreader-inline-color: #e95849;"><code>~&quot;#1</code></span></p>

<p>$[9][0][12]_{(-15)}=$<span data-darkreader-inline-color="" style="color: rgb(231, 76, 60); --darkreader-inline-color: #e95849;"><code>*!-</code></span></p>

<p>$[43][52][44][40]_{(69)}=$<span data-darkreader-inline-color="" style="color: rgb(231, 76, 60); --darkreader-inline-color: #e95849;"><code>LUMI</code></span></p>

<p>$N$은 음의 정수일 수 있으며, 음의 정수 진법에 대한 설명은 힌트를 참조한다.</p>

### 입력

<p>첫 번째 줄에는 진법의 밑 $N(2 \le |N| \le 93)$이 주어진다.</p>

<p>두 번째 줄과 세 번째 줄에는 $N$진법으로 표현된 $A, B$가 각각 주어진다. $A, B$는 $N$진법으로 표현했을 때 $3\,000$자를 넘기지 않는다.</p>

<p>$A$ 또는 $B$의 앞에 불필요한 <span data-darkreader-inline-color="" style="color: rgb(231, 76, 60); --darkreader-inline-color: #e95849;"><code>!</code></span>가 오지 않는다. 또한, <span data-darkreader-inline-color="" style="color: rgb(231, 76, 60); --darkreader-inline-color: #e95849;"><code>~</code></span>는 $N$이 양의 정수일 때만 맨 앞에 최대 한 번까지 나올 수 있다. $N$이 음의 정수가 될 수 있음에 유의한다.</p>

### 출력

<p>$A$와 $B$를 곱한 값을 $N$진법으로 출력한다.</p>

### 힌트

<p>음의 정수 $N$에 대하여 $N$진법은 양의 정수 진법과 똑같이 왼쪽으로 한 자리가 넘어갈 경우, $N$배가 된다. 하지만, 각 자리에 들어가는 숫자의 범위를 $0 \le x \lt -N$으로 한정한다.</p>

<p>예를 들어 $10$진법 $9\,903$은 $-10$진법으로는 $11\,903$이 된다.</p>

<p>$11\,903_{(-10)} = 1 \times (-10) ^ 4 + 1 \times (-10) ^ 3 + 9 \times (-10) ^ 2 + 0 \times (-10) ^ 1 + 3 \times (-10) ^ 0 = 9\,903 _{(10)}$.</p>