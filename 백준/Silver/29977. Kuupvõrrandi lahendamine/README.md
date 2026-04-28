# [Silver II] Kuupvõrrandi lahendamine - 29977

[문제 링크](https://www.acmicpc.net/problem/29977)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 13, 맞힌 사람: 11, 정답 비율: 44.000%

### 분류

브루트포스 알고리즘, 구현, 수학

### 문제 설명

<p>Kui $x_1$, $x_2$ ja $x_3$ on kuupv&otilde;rrandi $x^3 + bx^2 + cx + d = 0$ lahendid, siis $$x^3 + bx^2 + cx + d = (x - x_1)(x - x_2)(x - x_3).$$</p>

<p>Olgu $b$, $c$ ja $d$ t&auml;isarvud absoluutv&auml;&auml;rtusega kuni $10\,000$ ning teada, et v&auml;hemalt &uuml;ks v&otilde;rrandi $x^3 + bx^2 + cx + d = 0$ lahend on t&auml;isarv ja k&otilde;ik lahendid on reaalarvud, mille absoluutv&auml;&auml;rtus pole suurem kui $10\,000$. Leida v&otilde;rrandi lahendid.</p>

### 입력

<p>Tekstifaili ainsal real on t&uuml;hikutega eraldatud t&auml;isarvud $b$, $c$ ja $d$.</p>

### 출력

<p>Tekstifaili kolmele reale v&auml;ljastada v&otilde;rrandi $x^3 + bx^2 + cx + d = 0$ kolm lahendit (m&otilde;ned v&otilde;ivad olla omavahel v&otilde;rdsed). Esimesel real peab olema t&auml;isarvuline lahend. Kui lahend sisaldab ruutjuurt, siis esitada ta kujul $u$<code>+sqrt(</code>$v$<code>)</code> v&otilde;i $u$<code>-sqrt(</code>$v$<code>)</code>. Kui $u$ ja/v&otilde;i $v$ pole t&auml;isarv, siis esitada ta taandatud murruna kujul $s$<code>/</code>$t$, kus $s$ v&otilde;ib olla negatiivne. Lahendid v&auml;ljastada t&uuml;hikuteta.</p>