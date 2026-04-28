# [Gold I] Pikulice - 25522

[문제 링크](https://www.acmicpc.net/problem/25522)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

비트마스킹, 외판원 순회 문제

### 문제 설명

<p>Marin je pratio JHIO i bio odu&scaron;evljen zadatkom Pikule. Stra&scaron;no ga je razočaralo &scaron;to ga nitko nije rije&scaron;io i to ga je danima kopkalo. <em>Hmm, nisu rije&scaron;ili pikule, ali ako im zadamo ne&scaron;to s pikulicama, to će biti manje zastra&scaron;ujuće, pikulice su jo&scaron; manje od pikula, koje su već male&hellip; Pikule, pikulice&hellip;</em> Tako je razmi&scaron;ljao Marin. I tako je nastao ovaj zadatak.</p>

<p>Na Marinovom stolu u niz je poredano $N+1$ postolja za pikulice, od kojih je točno jedno prazno. Na ostalim postoljima nalazi se po jedna pikulica crvene ili plave boje. Marin se sa svojim pikulicama igra tako da ih premje&scaron;ta na jedan od sljedeća dva načina:</p>

<ul>
	<li>pomakne pikulicu susjednu praznom postolju na prazno postolje, čime postolje na kojem je ta pikulica bila postaje prazno</li>
	<li>preskoči pikulicom $A$ susjednu pikulicu $B$, pod uvjetom da su pikulice različite boje i da je pikulici $B$ susjedno prazno postolje koje pikulica $A$ zauzima nakon preskakanja, dok postolje na kojem je pikulica $A$ prvotno bila postaje prazno.</li>
</ul>

<p>Za oba načina premje&scaron;tanja potrebna mu je jedna sekunda (Marin je vje&scaron;t sa svojim pikulicama).</p>

<p>Jedne ožujske večeri (ili jutra, kako se uzme), u posjet mu je nenajavljeno do&scaron;ao prijatelj Stjepan, do&scaron;etao do stola s pikulicama i rekao:</p>

<ul>
	<li>Nije ti to dobro.</li>
</ul>

<p>Marin se suzdržao od nasilja i zamolio Stjepana da pojasni svoj komentar.</p>

<ul>
	<li>Moraju ti prvo ići sve crvene, pa prazno postolje, pa sve plave.</li>
</ul>

<p>Marin je uvijek otvoren za konstruktivnu kritiku, ali mu se i žuri na sastanak s prijateljicom pa je svoje pikulice ispremje&scaron;tao po Stjepanovom naputku najbrže &scaron;to je mogao. Koliko mu je sekundi trebalo?</p>

### 입력

<p>U prvom je retku prirodan broj $N$ ($1 &le; N &le; 20$).</p>

<p>U drugom je retku riječ od $N+1$ znakova, početno stanje na postoljima. Svaki od znakova je iz skupa {&lsquo;C&rsquo;, &lsquo;P&rsquo;, &lsquo;X&rsquo;}, koji redom predstavljaju crvene pikulice, plave pikulice i prazno postolje.</p>

### 출력

<p>U prvi i jedini redak ispi&scaron;i traženi broj sekundi. Ako nije moguće ispremje&scaron;tati pikulice po Stjepanovom naputku, ispi&scaron;i -1.</p>

### 힌트

<p>Opis prvog primjera: Marin je najprije plavom pikulicom preskočio crvenu, dobiv&scaron;i time stanje XCP, a potom je crvenu kuglicu pomaknuo na susjedno prazno postolje, dobiv&scaron;i time konačno stanje CXP.</p>