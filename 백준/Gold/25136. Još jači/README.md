# [Gold III] Još jači - 25136

[문제 링크](https://www.acmicpc.net/problem/25136)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Jednom davno u dalekoj zemlji živio je car Malnar koji je volio ratovati. Ostala su se kraljevstva udružila protiv njega i s jednom velikom vojskom krenula u napad na njegov dvorac.</p>

<p>Jedini je put do dvorca dugačka staza, uz koju je postavljeno $n$ tornjeva. Na tom putu, $i$-ti toranj vidi interval od $l_i$ do $r_i$ te se na njemu nalazi $p_i$ strijelaca. Svaki strijelac može u jednoj sekundi pogoditi jednog vojnika.</p>

<p>Stazom prolazi velika vojska koja se sastoji od $k$ vojnika. Vojska prelazi jedan metar u sekundi. Primjerice, ako vojska naiđe na toranj koji nadzire područje od $2$ do $5$ i na njemu se nalazi jedan strijelac, on će pogoditi $3$ vojnika prije nego &scaron;to vojska izađe iz njegovog vidokruga. U blizini svakog tornja nalazi se i selo. U $i$-tom selu nalazi se $s_i$ seljaka koji su voljni pomoći i svi zajedno postati strijelci i-tog tornja za $c_i$ zlatnika. Car Malnar je <s>pohlepan</s> velikodu&scaron;an i želi potro&scaron;iti &scaron;to manje zlatnika kako bi porazio protivničku vojsku. Pomozite mu!</p>

### 입력

<p>U prvom su retku prirodni brojevi $n$ ($1 &le; n &le; 1\,000$) i $k$ ($1 &le; k &le; 10\,000$) iz teksta zadatka.</p>

<p>U sljedećih $n$ redaka nalaze se prirodni brojevi $l_i$, $r_i$, $p_i$ ($1 &le; l_i , r_i , p_i &le; 1\,000$, $l_i &lt; r_i$), koji redom predstavljaju lijevu i desnu granicu vidokruga $i$-tog tornja, te broj strijelaca na $i$-tom tornju. Intervali tornjeva mogu se preklapati.</p>

<p>U sljedećih $n$ redaka nalaze se prirodni brojevi $s_i$, $c_i$ ($1 &le; s_i &le; 1\,000$, $1 &le; c_i &le; 10^5$), koji označavaju da $i$-tom tornju za $c_i$ zlatnika može pomoći $s_i$ seljaka.</p>

### 출력

<p>U prvom i jedinom retku potrebno je ispisati koliko je minimalno zlata potrebno potro&scaron;iti da se porazi protivnička vojska. Ako vojsku nikako nije moguće poraziti ispi&scaron;ite &quot;PREDAJA&quot; (bez navodnika).</p>