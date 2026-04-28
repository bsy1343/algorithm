# [Gold III] Pizza Party! - 24409

[문제 링크](https://www.acmicpc.net/problem/24409)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 82, 정답: 24, 맞힌 사람: 20, 정답 비율: 30.769%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 구현, 파싱, 문자열, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>You are co-organizing a computer science conference, and you are in charge of a pizza party for the conference guests. Each guest holds preferences over combinations of toppings, and guests are seated in groups by table in the conference center ballroom. One pizza is served to each table. You must make sense of each table&rsquo;s collective preferences by finding pizza toppings that make all guests happy at a particular table. Since you are paying by the topping, the conference organizers wish to find the <em>minimal</em> set of satisfying toppings for each table&rsquo;s pizza.</p>

<p>Pizza preferences are specified as statements in either an <em>absolute</em> or <em>implicative</em> form. An <em>absolute preference</em> for <code>pepperoni</code> is a statement that pepperoni must be on the pizza in order to satisfy a particular guest. An <em>implicative preference</em> is a conditional statement. For example, the preference <code>if pepperoni and sausage then mushroom</code> indicates that a pizza with both pepperoni and sausage must also have mushrooms. Note that the implicative preference says nothing about a preference for mushrooms when either pepperoni or sausage are absent from the pizza.</p>

<p>Guests are already organized by table and each table&rsquo;s preferences are aggregated. It is your job to find a topping assignment for the pizza at each table.</p>

### 입력

<p>The first line of input consists of a single integer $c$ ($1 &le; c &le; 1\,000$), the number of preferences for the pizza you are trying to create. This is followed by $c$ lines containing either an absolute or implicative preference.</p>

<p>The name of each topping is a single word, not exceeding $10$ characters in length, consisting of only lowercase English letters. The words <code>if</code>, <code>and</code>, <code>or</code>, and <code>then</code> are not valid names for pizza toppings.</p>

<p><em>Absolute preferences</em> consist of a single topping name. All <em>implicative preferences</em> are either of the form <code>if&nbsp;</code>$t_1$<code> and&nbsp;</code>$t_2$<code> and ... and </code>$t_k$<code> then </code>$t_{k+1}$, <em>or</em> <code>if </code>$t_1$<code> or </code>$t_2$<code> or ... or </code>$t_k$<code> then </code>$t_{k+1}$, where each of $t_1$, $t_2$, $\dots$, $t_{k+1}$ are topping names and $1 &le; k &le; 500$.</p>

### 출력

<p>For the provided test case, print one line with a single integer $t$ &mdash; the minimal number of toppings for a pizza that satisfies all guests at the table.</p>