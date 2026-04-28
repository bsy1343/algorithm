# [Silver I] Studschiffret - 20834

[문제 링크](https://www.acmicpc.net/problem/20834)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 12, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

수학, 구현, 시뮬레이션

### 문제 설명

<p>Fretchif har hittat p&aring; ett revolution&auml;rt chiffer som ingen kommer kunna l&ouml;sa! S&aring; h&auml;r g&aring;r det till: Man v&auml;ljer en str&auml;ng att kryptera och tv&aring; heltal $N$ och $M$. Sedan ritar man upp ett rutn&auml;t med $N$ rader och $M$ kolumner. D&auml;refter b&ouml;rjar man skriva ut str&auml;ngen man krypterar en bokstav i taget snett ned&aring;t till h&ouml;ger fr&aring;n &ouml;versta v&auml;nstra h&ouml;rnet. Om vi numrerar kolumnerna fr&aring;n v&auml;nster till h&ouml;ger $1$ till $M$, och raderna uppifr&aring;n och ned $1$ till $N$ s&aring; hamnar f&ouml;rsta bokstaven hamnar p&aring; position $(1,1)$, andra p&aring; $(2,2)$, tredje p&aring; $(3,3)$ och s&aring; vidare. N&auml;r man kommer till en av rutn&auml;tets v&auml;ggar, s&aring; l&aring;ter man &rdquo;bokstavsstr&aring;len&rdquo; studsa p&aring; v&auml;ggen (se exempelf&ouml;rklaringen). Ifall man vid n&aring;got tillf&auml;lle hamnar p&aring; en ruta som det redan st&aring;r en bokstav i, s&aring; tar bokstaven man skulle skrivit och skriver den i n&auml;sta lediga ruta man kommer till ist&auml;llet. N&auml;r alla bokst&auml;ver i str&auml;ngen som krypteras &auml;r slut s&aring; l&auml;ser man av rutn&auml;tet rad f&ouml;r rad, och det blir det krypterade meddelandet.&nbsp;</p>

<p>Givet ett meddelande som Fretchif krypterat med studschiffret, och givet storleken p&aring; rutn&auml;tet som anv&auml;ndes, skriv ut orginalmeddelandet.</p>

<p>Notera att vissa meddelanden inte g&aring;r att kryptera med vissa storlekar p&aring; rutn&auml;t, d&aring; det &auml;r m&ouml;jligt att man aldrig kommer till n&aring;gon ny ledig ruta men fortfarande har bokst&auml;ver kvar att placera ut. H&auml;r &auml;r det dock garanterat att det inte h&auml;nde n&auml;r Fretchif krypterade str&auml;ngen.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r tv&aring; heltal $2 \leq N \leq 20$ och $2 \leq M \leq 20$, antalet rader och kolumner i rutn&auml;tet. P&aring; andra raden st&aring;r en str&auml;ng med $K$ bokst&auml;ver ($1 \leq K \leq 30$), det krypterade meddelandet. Meddelandet best&aring;r endast av bokst&auml;verna <code>A</code> till <code>Z</code> och alla bokst&auml;ver &auml;r stora. Det &auml;r garanterat att det finns en m&ouml;jlig ursprungsstr&auml;ng som ger denna chiffertext.</p>

### 출력

<p>Programmet ska skriva ut en rad med en str&auml;ng: orginalmeddelandet, s&aring; som det s&aring;g ut innan det krypterades.</p>

### 힌트

<p>S&auml;g att str&auml;ngen vi ska kryptera &auml;r <code>ABCDEFGHIKLMNOPQRST</code>, och att rutn&auml;tet har storlek $6 \times 13$. S&aring; h&auml;r ser rutn&auml;tet ut vid olika tidspunkter i krypteringen:</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/20834.%E2%80%85Studschiffret/ce72ac2b.png" data-original-src="https://upload.acmicpc.net/27c1cb5c-61ed-4ff9-aa37-f810a92fcbe8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 369px; height: 170px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/20834.%E2%80%85Studschiffret/83d78df3.png" data-original-src="https://upload.acmicpc.net/3da99237-36c5-41d9-b7f7-2fef744f47b6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 369px; height: 170px;" /></td>
		</tr>
		<tr>
			<td>Efter 6 bokst&auml;ver &auml;r skrivna</td>
			<td>Efter 8 bokst&auml;ver &auml;r skrivna, vi har nu studsat en g&aring;ng i bottenv&auml;ggen</td>
		</tr>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/20834.%E2%80%85Studschiffret/2e37bcbf.png" data-original-src="https://upload.acmicpc.net/0ec84b8b-a0cd-45d1-a05f-372df155a351/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 369px; height: 170px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/20834.%E2%80%85Studschiffret/c9270593.png" data-original-src="https://upload.acmicpc.net/e42015dc-84d7-44b9-875f-36552951b167/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 369px; height: 170px;" /></td>
		</tr>
		<tr>
			<td>Efter 14 bost&auml;ver &auml;r skrivna, vi har nu &auml;ven studsat i &ouml;vre och h&ouml;gra v&auml;ggen</td>
			<td>Efter alla 20 bokst&auml;ver &auml;r skrivna, notera att vi inte skrev &ouml;ver <code>H</code>:et med ett <code>R</code>, utan vi skrev <code>R</code>:et p&aring; n&auml;sta lediga plats</td>
		</tr>
	</tbody>
</table>

<p>I det h&auml;r exemplet blir allts&aring; det krypterade meddelandet <code>ATKBSJLCRIMDHNEGQOFP</code>. Exempel 2 &auml;r att avkoda <code>ATKBSJLCRIMDHNEGQOFP</code>, vilket d&aring; avkodas till <code>ABCDEFGHIKLMNOPQRST</code>.</p>