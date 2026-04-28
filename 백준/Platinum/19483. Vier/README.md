# [Platinum V] Vier - 19483

[문제 링크](https://www.acmicpc.net/problem/19483)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 43, 정답: 19, 맞힌 사람: 14, 정답 비율: 46.667%

### 분류

다이나믹 프로그래밍, 무작위화

### 문제 설명

<p>The online game you&#39;ve built in problem &quot;Oha&quot; involves $n$ types of monsters. The monster types are numbered from 1 to $n$, and a monster of $i$-th type has strength $i$ and magical ability $\pi_i$. All magical abilities are different integers between $1$ and $n$, inclusive, in other words, $\pi$ is a permutation. For simplicity, you have generated this permutation uniformly at random.</p>

<p>Now you need to choose the starting teams of monsters for the two sides of the game. Each side must have exactly two monsters in the starting team (they can be of the same type), and the starting teams must be different. However, in order for the game to be balanced, the starting teams must have the same total strength modulo $n$ and the same total magical ability modulo $n$.</p>

<p>More formally, you need to find four integers $a$, $b$, $c$ and $d$ between 1 and $n$ such that:</p>

<ol>
	<li>$a+b \equiv c+d \pmod{n}$, and</li>
	<li>$\pi_a + \pi_b \equiv \pi_c + \pi_d \pmod{n}$.</li>
</ol>

<p>Note that the above statements are trivially true when $a=c$ and $b=d$, or when $a=d$ and $b=c$. You need to find any other solution, or report that there isn&#39;t any. Note that it&#39;s allowed for some of the four integers to coincide --- the only restriction is that they can&#39;t coincide in the two ways described in the first sentence of this paragraph.</p>

### 입력

<p>The first line of the input file contains one integer $n$, $2 \le n \le 10^6$. The second line of the input file contains $n$ distinct integers, each between 1 and $n$. The $i$-th of those integers gives the value of $\pi_i$.</p>

<p>It is guaranteed that the permutation was picked uniformly at random out of all permutations of $n$ integers.</p>

### 출력

<p>If a non-trivial solution exists, print <code>Ja</code> on the first line of the output file, otherwise print <code>Nein</code>. In case you printed <code>Ja</code>, on the second line print four integers between 1 and $n$: $a$, $b$, $c$ and $d$.</p>

### 힌트

<p>There are 50 non-sample testcases in this problem.</p>