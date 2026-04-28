# [Platinum III] Don't Stay - 19080

[문제 링크](https://www.acmicpc.net/problem/19080)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

구현, 문자열, KMP

### 문제 설명

<p>There are infinitely many lamps on a line, numbered with integers. Each lamp can be either turned on or turned off. There is a lamplighter, initially located at lamp number $0$. He can walk one lamp left or right (that is, decrease or increase his coordinate by $1$) and toggle the lamp at his position. We denote these actions with letters &quot;<code>L</code>&quot;, &quot;<code>R</code>&quot; and &quot;<code>X</code>&quot;, respectively.</p>

<p>A string of letters &quot;<code>L</code>&quot;, &quot;<code>R</code>&quot; and &quot;<code>X</code>&quot; is called a program for the lamplighter. For example, if he is currently at position $0$ and receives the string &quot;<code>RRXL</code>&quot;, he goes right twice, toggles a lamp which is at position $2$, and then goes left and ends up at position $1$.</p>

<p>Initially, all lamps are turned off. In the end, you want to achieve a state where the lamps with coordinates $a_1$, $\ldots$, $a_n$ are turned on, and all other lamps are turned off. The lamplighter has some program $s$ which he is going to execute, and he does not want to change his plans a lot. However, he agreed to help you a bit. If you give him some program $t$, he will start by executing all instructions from $t$. Then he will execute his own program $s$, as he planned before. However, after that, he will try to <em>cancel</em>&nbsp;his help by performing all instructions from $t$ in reverse order, changing &quot;<code>L</code>&quot; to &quot;<code>R</code>&quot; and vice versa. See Notes section for an explanation by example.</p>

<p>Given the coordinates $a_i$ and the lamplighter&#39;s program $s$, find such program $t$ that in the end, lamps $a_1$, $\ldots$, $a_n$ are on and all other lamps are off, or determine that it is not possible.</p>

### 입력

<p>The first line of input contains a string $s$ ($1 \leq |s| \leq 2 \cdot 10^5$) consisting of characters &quot;<code>L</code>&quot;, &quot;<code>R</code>&quot; and &quot;<code>X</code>&quot;: the initial program of the lamplighter.</p>

<p>The second line contains an integer $n$ ($0 \leq n \leq 2 \cdot 10^5$), the number of lamps which should be turned on in the end. The third line contains $n$ space-separated integers: the coordinates of the lamps. All given coordinates are distinct and do not exceed $2 \cdot 10^5$ by absolute value.</p>

### 출력

<p>Output the string $t$ which you can give to the lamplighter to achieve your goal. If there are several possible answers, output any one of them. The answer may be empty. The length of the answer must not exceed $2 \cdot 10^6$ characters.</p>

<p>If achieving the goal is not possible, print a single word &quot;<code>NO</code>&quot; (without quotes).</p>

### 힌트

<p>In the example, the lamplighter has the string &quot;<code>RXR</code>&quot;, and the desired lamp positions are $-2$, $0$ and $2$. You can give the lamplighter the string &quot;<code>XLLXR</code>&quot;. His combined program then becomes &quot;<code>XLLXR-RXR-LXRRX</code>&quot; (dashes for clarity).</p>

<p>The lamplighter will light the lamp number $0$, then go to $-2$ and light it, go to $0$ and turn it off, turn it on again, and finally go to $2$ and turn it on. In the end, the state of all lamps is the one you wanted.</p>