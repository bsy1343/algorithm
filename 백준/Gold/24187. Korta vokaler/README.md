# [Gold IV] Korta vokaler - 24187

[문제 링크](https://www.acmicpc.net/problem/24187)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 32, 정답: 22, 맞힌 사람: 22, 정답 비율: 68.750%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>Att l&ouml;sa algoritmproblem &auml;r sv&aring;rt, men en sak som ofta &auml;r &auml;nnu sv&aring;rare &auml;r att f&ouml;rbereda testdatan. Ta problemet <em>Arabiska</em> till exempel. H&auml;r har juryn lagt m&aring;nga timmars intensivt arbete &aring;t att konstruera m&auml;sterverk som <code>hej vad heter du</code>.</p>

<p>En fr&aring;ga som dyker upp &auml;r: hur skapar man textstr&auml;ngar som inte inneh&aring;ller n&aring;gra korta vokaler? Om du l&auml;ste uppgiften <em>Arabiska</em> s&aring; kanske du kommer ih&aring;g att en kort vokal &auml;r en vokal som f&ouml;ljs av minst tv&aring; konsonanter. I ordet <code>tall</code> s&aring; &auml;r a:et en kort vokal, medan ordet <code>potatis</code> inte har n&aring;gra korta vokaler. F&ouml;r enkelhets skull r&auml;knar vi &nbsp;<em>a, e, i, o, u, y</em> som vokaler i det h&auml;r problemet.</p>

<p>Ett s&auml;tt att skapa ord som inte inneh&aring;ller n&aring;gra korta vokaler &auml;r att utg&aring; ifr&aring;n ett ord, och sedan ta bort n&aring;gra bokst&auml;ver fr&aring;n det. Om vi utg&aring;r fr&aring;n <code>potatis</code> s&aring; skulle vi d&aring; kunna f&aring; <code>ptais</code> till exempel. Men om ordet ist&auml;llet blev <code>otats</code> s&aring; uppstod tyv&auml;rr en kort vokal.</p>

<p>Din uppgift &auml;r att r&auml;kna antalet s&auml;tt att ta bort bokst&auml;ver fr&aring;n ett givet ord s&aring; att resultatet inte inneh&aring;ller n&aring;gra korta vokaler. Det &auml;r till&aring;tet att inte ta bort n&aring;gra bokst&auml;ver alls (i andra exemplet s&aring; bidrar det med $1$ till svaret). D&auml;remot &auml;r det inte till&aring;tet att ta bort alla bokst&auml;ver. Om samma ord uppst&aring;r genom att ta bort olika m&auml;ngder bokst&auml;ver, s&aring; r&auml;knas de separat (I f&ouml;rsta exemplet finns det tv&aring; s&auml;tt att f&aring; ordet <code>tal</code>, vi kan ta bort det f&ouml;rsta eller det andra <code>l</code>:et).</p>

### 입력

<p>Indatan best&aring;r av en rad med ett ord $S$ med h&ouml;gst $50$ bokst&auml;ver. Ordet best&aring;r bara av bokst&auml;verna <code>a-z</code>.</p>

### 출력

<p>Skriv ut ett heltal, antalet s&auml;tt att ta bort bokst&auml;ver s&aring; att ett ord utan korta vokaler bildas.</p>

<p>Notera att svaret inte alltid f&aring;r plats i ett $32$-bitars heltal i de senare testfallen.</p>