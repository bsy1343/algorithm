# [Platinum IV] Skidor - 20884

[문제 링크](https://www.acmicpc.net/problem/20884)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

자료 구조, 덱, 덱을 이용한 구간 최댓값 트릭

### 문제 설명

<p>Johan gillar att &aring;ka skidor. D&aring; menar vi inte att &aring;ka slalom, vilket Johan n&auml;mligen &auml;r v&auml;ldigt r&auml;dd f&ouml;r. L&aring;ngf&auml;rdsskidor d&auml;remot, det &auml;r hans grej. N&auml;r man &aring;ker l&aring;ngf&auml;rdsskidor m&aring;ste man dock ha stora plana ytor.</p>

<p>Johan har unders&ouml;kt ett stort rektangul&auml;rt omr&aring;de ute i skogen, som har ganska oj&auml;mn mark. H&auml;r vill Johan v&auml;lja ut en viss kvadrat att &aring;ka runt p&aring;, som &auml;r tillr&auml;ckligt stor f&ouml;r att g&ouml;ra skid&aring;kningen intressant. Kvadraten ska ha exakt storlek $L \times L$, och ha sidor parallella med omr&aring;dets sidor.</p>

<p>Nu ber han dig hitta en s&aring;dan kvadrat. F&ouml;r att den ska passa bra f&ouml;r l&aring;ngf&auml;rdsskidor har han tv&aring; krav. Dels f&aring;r det inte finnas n&aring;gra tr&auml;d i kvadraten, och dels ska h&ouml;jdskillnaden mellan den h&ouml;gsta och den l&auml;gsta punkten i denna kvadrat vara s&aring; liten som m&ouml;jligt.</p>

<p>Om det finns finns flera m&ouml;jliga s&aring;dana kvadrater, ska du i f&ouml;rsta hand v&auml;lja den som ligger l&auml;ngst norrut, d.v.s har l&auml;gst radnummer. Om det fortfarande finns flera m&ouml;jliga ska du i andra hand v&auml;lja den som ligger l&auml;ngst v&auml;sterut, d.v.s. har l&auml;gst kolumnnummer.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tre heltal $R$, $C$, $L$ s&aring;dana att $1\leq R,C \leq 1000, 1 \leq L \leq min(R,C)$. $R$ &auml;r antalet rader i det stora omr&aring;det, $C$ antalet kolumner, och $L$ storleken p&aring; den s&ouml;kta kvadraten.</p>

<p>D&auml;refter f&ouml;ljer $R$ rader, en f&ouml;r varje rad i omr&aring;det. En rad inneh&aring;ller $C$ heltal, en f&ouml;r varje kolumn i omr&aring;det.</p>

<p>Det $c$:te talet p&aring; den $r$:te raden beskriver h&ouml;jden $H_{rc}$ p&aring; den punkten i omr&aring;det, som &auml;r s&aring;dan att s&aring;dana att $-1 \leq H_{rc} \leq 10^9$. Om $H_{rc} = -1$ finns det ist&auml;llet att det <strong>st&aring;r ett tr&auml;d p&aring; den platsen</strong>.</p>

### 출력

<p>Hitta $r_l$, $c_l$ s&aring;dana att Johans kvadrat sp&auml;nner &ouml;ver koordinaterna $r_l \leq r &lt;r_l + L$, $c_l \leq c &lt; c_l + L$. $r_l$ och $c_l$ ska vara 0-indexerade, exemplevis &auml;r $r_l = 0$ om den f&ouml;rsta raden (som ligger l&auml;ngst norrut) menas, och $c_l = 0$ om den f&ouml;rsta kolumnen (som ligger l&auml;ngst v&auml;sterut) menas.</p>

<p>Det &auml;r garanterat att det finns en l&ouml;sning.</p>