# [Silver III] SORT - 25138

[문제 링크](https://www.acmicpc.net/problem/25138)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 30, 맞힌 사람: 27, 정답 비율: 64.286%

### 분류

구현, 문자열, 정렬, 파싱

### 문제 설명

<p>Mirko je prihvatio posao sortiranja hrvatskog riječnika uz uvjet da nikada neće imati doticaja sa slovima s kvačicama i crticama. Ono na &scaron;to nije mislio su slova digrafi <strong>lj</strong> i <strong>nj</strong>, sastavljena od dva znaka, koja mu zadaju glavobolje iako nemaju kvačice i crtice. Tako je poredak hrvatskih slova koja se mogu pojaviti u riječima:</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td>a</td>
			<td>b</td>
			<td>c</td>
			<td>d</td>
			<td>e</td>
			<td>f</td>
			<td>g</td>
			<td>h</td>
			<td>i</td>
			<td>j</td>
			<td>k</td>
			<td>l</td>
		</tr>
		<tr>
			<td>lj</td>
			<td>m</td>
			<td>n</td>
			<td>nj</td>
			<td>o</td>
			<td>p</td>
			<td>r</td>
			<td>s</td>
			<td>t</td>
			<td>u</td>
			<td>v</td>
			<td>z</td>
		</tr>
	</tbody>
</table>

<p>Primijetite kako riječ &ldquo;<strong>njegov</strong>&rdquo; ima 6 znakova, ali 5 slova i u riječniku dolazi nakon riječi &ldquo;<strong>novine</strong>&rdquo; budući da slovo <strong>&lt;nj&gt;</strong> dolazi nakon slova <strong>&lt;n&gt;</strong>. Da je prvo slovo bilo jednako u obje riječi, sljedeće slovo bi odlučivalo o njihovom poretku, itd. Ako se uspoređuju riječi koje su nastale kao dodatak jedne na drugu, kao &ldquo;<strong>pas</strong>&rdquo; i &ldquo;<strong>pasijans</strong>&rdquo; tada kraća riječ dolazi prije duže riječi. Ovakav poredak naziva se <strong>leksikografskim</strong> budući da ga nalazimo u riječnicima i leksikonima.</p>

<p>Odredi ispravan <strong>leksikografski</strong> poredak zadanih hrvatskih riječi.</p>

### 입력

<p>U prvom retku nalazi se prirodan broj N, broj riječi. U sljedećih N redaka nalazi se po jedna riječ sastavljena od gore navedenih znakova. Svaka riječ sadržavati će barem jedan znak i ukupan broj znakova u svim riječima <strong>neće biti veći od 100 000</strong>.</p>

### 출력

<p>U N redaka ispi&scaron;i ispravan <strong>leksikografski</strong> poredak zadanih riječi.</p>

### 힌트

<p><strong>Poja&scaron;njenje trećeg test primjera:</strong> Riječ &ldquo;bolje&rdquo; sastoji se od slova &lt;B&gt; &lt;O&gt; &lt;Lj&gt; &lt;E&gt;, dok se riječ &ldquo;bolnica&rdquo; sastoji od slova &lt;B&gt; &lt;O&gt; &lt;L&gt; &lt;N&gt; &lt;I&gt; &lt;C&gt; &lt;A&gt;. Budući da su prva dva slova u obje riječi jednaka, treće slovo odlučuje koja riječ će se u riječniku naći prije. Slovo &lt;Lj&gt; dolazi nakon slova &lt;L&gt; pa riječ &ldquo;bolje&rdquo; u riječniku dolazi nakon riječi &ldquo;bolnica&rdquo;.</p>

<p>Nadalje, riječ &ldquo;novine&rdquo; dvaput se pojavljuje u ulazu te stoga i u izlazu.</p>