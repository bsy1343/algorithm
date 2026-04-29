# [Platinum III] Pizza Party - 32415

[문제 링크](https://www.acmicpc.net/problem/32415)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 14, 맞힌 사람: 13, 정답 비율: 39.394%

### 분류

가장 긴 증가하는 부분 수열 문제, 그리디 알고리즘, 자료 구조, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Troy is fleshing out the details of his latest initiative, HackCCO! Everyone knows that the biggest appeal of any hackathon is the free food. As such, to ensure the unparalleled success of HackCCO, Troy ordered a comically large cart stacked with $N$ pizzas where the $i$-th pizza from the top of the cart has flavour $a_i$.</p>

<p>After the pizza cart arrives, Troy needs to arrange them into some number of stacks on a long table. To do this, he takes the pizzas one-by-one from the top of the cart and moves them onto the table, each time either placing the pizza on top of another stack of pizzas or forming a new stack on the table.</p>

<p>The $N$ hungry HackCCO participants are lined up to get pizza from the table, one-by-one. Troy knows that the $i$-th person in line has a favourite pizza flavour of $b_i$. When the $i$-th person walks up to the table, if they see any pizzas of their favourite flavour at the top of any stack they will take any one of them at random. Otherwise, they won’t take anything and will leave the table hungry.</p>

<p>Of course, hungry coders are not happy coders, so Troy doesn’t want anyone to leave the table hungry. Thus, he asks you to help him find an arrangement of pizzas on the table such that it is possible for nobody to leave hungry. Furthermore, out of all such arrangements, Troy wants you to find one that creates the smallest number of stacks on the table (after all, tables can only get so long). Help him find such an arrangement or determine that it’s impossible!</p>

### 입력

<p>The first line of input contains a single integer $N$.</p>

<p>The second line of input contains $N$ space-separated integers $a_1, \dots , a_N$ ($1 ≤ a_i ≤ N$).</p>

<p>The third line of input contains $N$ space-separated integers $b_1, \dots , b_N$ ($1 ≤ b_i ≤ N$).</p>

### 출력

<p>If it is impossible to arrange the pizzas as desired, output <code>-1</code>.</p>

<p>Otherwise, your output should consist of three lines. On the first line output $K$, the minimum number of stacks required. On the second line output $N$ space-separated integers $c_1, \dots , c_N$ ($1 ≤ c_i ≤ K$), indicating that the $i$-th pizza should be placed on stack $c_i$. On the third line output $N$ space-separated integers $d_1, \dots , d_N$ ($1 ≤ d_i ≤ K$), indicating that the $i$-th person in line takes their pizza from the $d_i$-th stack. This stack must have a pizza of flavour $b_i$ at the top when the $i$-th participant walks up to get their pizza.</p>