# [Platinum V] Elokventni Evaluator - 18280

[문제 링크](https://www.acmicpc.net/problem/18280)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 56, 정답: 14, 맞힌 사람: 11, 정답 비율: 27.500%

### 분류

구현, 문자열, 브루트포스 알고리즘, 많은 조건 분기, 파싱

### 문제 설명

<p>U maloj kućici na livadi, u kojoj jela s ro&scaron;tilja po recepturi starih leskovačkih majstora priprema Kostadin Stefanović, objeduju Matej i gospodin Malnar. Ovoga puta je Matej sazvao sastanak, a tema razgovora je izrada novog sustava za evaluaciju, starog je ipak vrijeme donekle pregazilo. Gospodin Malnar se sa svime složi te nadoda: &ldquo;...i evaluator mora biti elokventniji.&rdquo;. &ldquo;Elokventniji? Kako to misli&scaron; elokventniji?! Jesi li siguran da su ovo vrganji?&rdquo;, odgovorio je Matej. Gospodin Malnar mu tada objasni kako mu je dosta gledanja u jedne te iste poruke poput <code>Točno!</code>, <code>Prekoračeno vremensko ograničenje!</code> ili <code>Pogre&scaron;ka pri kompilaciji!</code>. Evaluatori bi se trebali prilagoditi zadatku i ponekad prokomentirati izlaz natjecateljeva programa, ipak je budućnost u umjetnoj inteligenciji. Va&scaron; je zadatak pomoći Mateju da izradi prototip jednog takvog evaluatora.</p>

<p>Zamislite zadatak u kojem natjecatelj u jednoj liniji mora ispisati matematički izraz oblika:</p>

<p style="text-align: center;"><code>&lt;broj&gt;&lt;operacija&gt;&lt;broj&gt;=&lt;broj&gt;</code></p>

<p>pri čemu <code>&lt;broj&gt;</code> označava bilo koji pozitivan cijeli broj manji ili jednak 10<sup>9</sup> bez vodećih nula, a <code>&lt;operacija&gt;</code> je jedan od znakova <code>+</code>, <code>-</code>, <code>*</code> ili <code>/</code> koji predstavlja jednu od četiri osnovne matematičke operacije. Izraz koji zadovoljava ova svojstva je <em>dobro formatiran</em>. Elokventni će evaluator na ovom zadatku prikazati jednu od sljedećih poruka:</p>

<ul>
	<li><code>Tocno</code> &ndash; ispisan je matematički ispravan izraz koji je dobro formatiran.</li>
	<li><code>Izraz nije ispravno formatiran</code> &ndash; ispisani izraz ne odgovara zadanom formatu.</li>
	<li><code>Netocno, umjesto &lt;izraz1&gt; mogli ste ispisati &lt;izraz2&gt;</code> &ndash; ispisani izraz (<code>&lt;izraz1&gt;</code>) je dobro formatiran, ali nije matematički točan te je promjenom <strong>najvi&scaron;e dva</strong> znaka u ispisu bilo moguće dobiti potpuno (matematički i formatom) ispravan izraz (<code>&lt;izraz2&gt;</code>).</li>
	<li><code>Potpuno netocno</code> &ndash; ispisani izraz je dobro formatiran, matematički nije točan i nije ga moguće ispraviti koristeći najvi&scaron;e dvije zamjene znakova.</li>
</ul>

### 입력

<p>U prvoj se liniji nalazi riječ od najvi&scaron;e 30 znakova koja predstavlja natjecateljevo rje&scaron;enje iz teksta zadatka. Ta riječ će se sastojati isključivo od dekadskih znamenaka (<code>0</code>, <code>1</code>, . . . , <code>9</code>), osnovnih računskih operatora (<code>+</code>, <code>-</code>, <code>*</code>, <code>/</code>) i znaka jednakosti (<code>=</code>).</p>

### 출력

<p>U jedini redak ispi&scaron;ite odgovarajuću poruku elokventnog evaluatora iz teksta zadatka.</p>