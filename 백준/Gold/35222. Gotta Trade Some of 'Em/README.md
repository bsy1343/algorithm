# [Gold V] Gotta Trade Some of 'Em - 35222

[문제 링크](https://www.acmicpc.net/problem/35222)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 20, 정답: 17, 맞힌 사람: 17, 정답 비율: 85.000%

### 분류

그래프 이론, 그래프 탐색, 플러드 필, 해 구성하기

### 문제 설명

<p>The kids at school are obsessed with a new video game of collectible pocket monsters called <em>Pokémon</em>. Their goal is to "catch 'em all" by completing the Pokédex, meaning they want to catch a copy of every Pokémon. Typically they do this by playing the game, encountering Pokémon, and catching them with a Pokéball.</p>

<p>Pokémon games are released in different variants. Each variant contains a number of Pokémon, some of which are exclusive to that variant. For example, only <em>Pokémon Blue</em> (variant $1$) allows encounters with the Pokémon known as Meowth. Thus, a kid owning <em>Pokémon Red</em> (variant $2$) cannot catch Meowth, and therefore must trade with a friend who has a Meowth to fill the Pokédex. This friend may either own Pokémon Blue or have received Meowth through another trade.</p>

<p>Your task is to distribute Pokémon variants to the kids so that, through trading among friends, every kid can eventually collect at least one of each Pokémon. Each kid receives exactly one Pokémon game variant. Each variant comes with enough copies of its Pokémon, both its exclusives and the non-exclusives, ensuring trades are always possible.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with three integers $n$, $m$, and $k$: the number $n$ of kids, with $1 \leq n \leq 100\,000$, the number $m$ of friendships, with $1 \leq m \leq 200\,000$, and the number $k$ of different game variants, with $1 \leq k \leq 100\,000$.</li>
<li>$m$ lines, each containing two integers $a$ and $b$ with $1\leq a &lt; b \leq n$, representing that $a$ and $b$ are friends.</li>
</ul>

### 출력

<p>Ouput $n$ integers, one for each kid, representing which game variant that kid should get. Your output will be considered correct if all kids can fill their Pokédex by using any number of trades with their friends.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>

<p>If there is no assignment of game variants to kids that allows all kids to fill their Pokédex, output <code>impossible</code>.</p>