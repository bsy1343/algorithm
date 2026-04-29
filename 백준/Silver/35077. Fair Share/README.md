# [Silver IV] Fair Share - 35077

[문제 링크](https://www.acmicpc.net/problem/35077)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 37, 정답: 34, 맞힌 사람: 22, 정답 비율: 95.652%

### 분류

구현, 누적 합

### 문제 설명

<p>Your university's teams are celebrating an outstanding performance at this year's NWERC in Karlsruhe. After a delicious dinner at a local restaurant, you call it a day. The trip home tomorrow will be a long one.</p>

<p>While trying to pay the bill, your group realizes that the restaurant takes no cash. Furthermore, it is too late to split the bill. Caught off-guard, everybody starts to open their wallets and puts some cash on the table. Someone has to pay the bill with their credit card and take the cash.</p>

<p>Each person $i$ spent €$b_i$ during the evening but has €$a_i$ in cash to contribute to the group payment (if someone else pays). To keep it fair, the group does not want the person who pays the final bill (and takes the money from the cash pool) to end up paying more than their individual share. Thus, if person $i$ is the one paying, then the remainder of the bill, after accounting for the cash contributions of the others, should not be more than their own share €$b_i$ of the bill.</p>

<p>Help the group determine who should pay the final bill.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($2 \leq n \leq 10^5$), the size of your dinner group.</li>
<li>$n$ lines, the $i$th of which contains two integers $a_i$ and $b_i$ ($1 \leq a_i, b_i \leq 1000$), the amount of cash person $i$ would contribute if someone else pays and their share of the bill, respectively.</li>
</ul>

### 출력

<p>If there is no suitable person to settle the bill, output "<code>impossible</code>". Otherwise, output one integer $i$ ($1 \leq i \leq n$), the index of the person settling the bill.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>