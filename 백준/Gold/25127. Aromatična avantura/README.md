# [Gold IV] Aromatična avantura - 25127

[문제 링크](https://www.acmicpc.net/problem/25127)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 9, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>Gospodin Malnar uživa u &scaron;etnjama te ga stoga zanima &scaron;etnja kroz mirisne gradske vrtove. Gradske vrtove možemo zamisliti kao graf gdje su vrtovi označeni brojevima od $1$ do $n$. Između njih postoji točno $m$ neusmjerenih jedinstvenih bridova. Također znamo da vrt označen brojem $i$ ima koeficijent aromatičnosti $A_i$.</p>

<p>A svima je već poznato, da bi &scaron;etnja bila avanturistična, aromatičnost mora imati svoje uspone i padove tj. ako sa $v_1, v_2, \dots , v_k$ označimo vrtove posjećene $u$ &scaron;etnji (koji nisu nužno različiti), mora vrijediti $A_{v_1} &lt; A_{v_2} &gt; A_{v_3} &lt; A_{v_4} \dots$</p>

<p>Sada Gospodina Malnara zanima do kojih sve vrtova može doći avanturističkom &scaron;etnjom krećući iz vrta $1$ (moguće je da &scaron;etnja Gospodina Malnara odmah i zavr&scaron;i u tom vrtu).</p>

### 입력

<p>U prvom su retku prirodni brojevi $n$ ($1 &le; n &le; 3 &middot; 10^5$) i $m$ ($1 &le; m &le; 3 &middot; 10^5$) iz teksta zadatka.</p>

<p>U sljedećem retku nalazi se $n$ brojeva od kojih je $i$-ti $A_i$ ($1 &le; A_i &le; 10^9$).</p>

<p>U $i$-tom od sljedećih $m$ redaka nalaze se po dva broja $u_i$ te $v_i$ ($1 &le; u_i , v_i &le; n$, $v_i \ne u_i$) koji označavaju da su vrtovi $u_i$ te $v_i$ spojeni bridom.</p>

### 출력

<p>U prvom retku potrebno je ispisati broj $k$, broj vrtova do kojih Gospodin Malnar može doći.</p>

<p>U sljedećem retku potrebno je ispisati $k$ brojeva u rastućem poretku, oznake vrtova do kojih Gospodin Malnar može doći.</p>