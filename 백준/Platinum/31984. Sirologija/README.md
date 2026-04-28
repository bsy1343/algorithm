# [Platinum III] Sirologija - 31984

[문제 링크](https://www.acmicpc.net/problem/31984)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 70, 정답: 13, 맞힌 사람: 12, 정답 비율: 20.000%

### 분류

그래프 이론, 그래프 탐색, 플러드 필

### 문제 설명

<p>Vi ste mrav, i to ne običan mrav već mrav opsjednut sirologijom!</p>

<p>Otkrili ste novu kri&scaron;ku sira u kuhinji, te želite poslati &scaron;to vi&scaron;e svojih podanika kako bi istražili sir. Sir možemo zamisliti kao tablicu s $N$ redaka i $M$ stupaca gdje su redci označeni brojevima od $1$ do $N$ odozgo prema dolje i stupci označeni brojevima od $1$ do $M$ s lijeva prema desno. Neka polja sadrže rupe, dok su ostala sir. Polje u $r$-tom retku i $s$-tom stupcu označavat ćemo kao $(r, s)$. U gornjem lijevom polju i donjem desnom polju će se sigurno nalaziti sir.</p>

<p>Označimo broj podanika s $K$. Va&scaron;i podanici započet će svoju istragu u gornjem lijevom polju te ga zavr&scaron;iti u donjem desnom polju. Mogu se kretati samo u smjerovima dolje i desno. Dodatno, njihovi putevi se ne smiju &quot;sjeći&quot; tj. možemo im dodijeliti oznake od $1$ do $K$ tako da ne postoji polje iz kojega je podanik s manjom oznakom iza&scaron;ao prema desno, a podanik s većom oznakom prema dolje.</p>

<p>Također, htjeli biste da su ti putevi ipak u nekom smislu &quot;različiti&quot;, tj. da za svaka dva podanika postoji polje $(r, s)$ u kojem se nalazi rupa, tako da se jedan od njih u nekom trenutku nalazio u stupcu $s$ te retku s oznakom manjom od $r$, a drugi u nekom trenutku (ne nužno istom) nalazio u stupcu $s$ te retku s oznakom većom od $r$. Neformalno, svaka dva podanika su neku rupu obi&scaron;li s različitih strana.</p>

<p>Ispi&scaron;ite najveći $K$ takav da postoji odabir putanja podanika koje zadovoljavaju tražene uvjete.</p>

<p>Neki primjeri puteva koji ne zadovoljavaju uvjete:</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td style="width: 50%;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31984.%E2%80%85Sirologija/acf667ed.png" data-original-src="https://upload.acmicpc.net/35416b36-7afe-4485-86ff-b9fd9e36ce46/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 199px; height: 200px;" /></td>
			<td style="width: 50%;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31984.%E2%80%85Sirologija/5ea5d242.png" data-original-src="https://upload.acmicpc.net/b4df8629-add7-4e15-b474-17f70577f7d7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 200px;" /></td>
		</tr>
		<tr>
			<td>(a) Lo&scaron; odabir puteva - sijeku se</td>
			<td>(b) Lo&scaron; odabir puteva - obilaze rupu s iste strane</td>
		</tr>
	</tbody>
</table>

### 입력

<p>U prvom su retku prirodni brojevi $N$, $M$.</p>

<p>U sljedećih $N$ redaka nalaze se opisi redaka tablice. U $i$-tom se retku nalazi $M$ znakova gdje . označava sir dok <code>#</code> označava polje koje sadrži rupu.</p>

### 출력

<p>U jedini redak ispi&scaron;ite najveću moguću vrijednost broja $K$.</p>

### 제한

<p>U svim podzadacima vrijedi $2 &le; N, M &le; 2000$.</p>

### 힌트

<p>Poja&scaron;njenje probnih primjera:</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31984.%E2%80%85Sirologija/89206141.png" data-original-src="https://upload.acmicpc.net/ffa3ff73-8702-44c8-a2c2-c75b7f531bf5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 200px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31984.%E2%80%85Sirologija/3027e3c5.png" data-original-src="https://upload.acmicpc.net/3704b5c8-00ff-4adf-9fc1-484b54b93b41/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 199px; height: 200px;" /></td>
		</tr>
		<tr>
			<td>(a) Primjer odabira puteva prvog primjera</td>
			<td>(b) Primjer odabira puteva drugog primjera</td>
		</tr>
	</tbody>
</table>