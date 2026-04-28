# [Silver IV] Cirkularni Cirkus - 26295

[문제 링크](https://www.acmicpc.net/problem/26295)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 57, 맞힌 사람: 48, 정답 비율: 73.846%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>U cirkusu u pauzi od predstava djeca se zabavljaju vrteći se na vrtuljku. Mirko sjedi na klupici i promatra ih. Prvo &scaron;to je uočio jest da je svih n mjesta na vrtuljku popunjeno i da ne postoje dva djeteta s istim početnim slovom imena. Odlučio je zapisivati neke podatke o vrtnjama.</p>

<p>U jednoj vrtnji vrtuljak najprije stoji na mjestu te ga zatim netko zarotira u smjeru kazaljke na satu. Vrtnja prestaje kada se vrtuljak prestane rotirati.</p>

<p>Djeca su odradila m vrtnji prije nego je bila gotova pauza između predstava u cirkusu. Za svaku od tih m vrtnji Mirko je zapisao koliko se puta u toj vrtnji promijenilo dijete koje sjedi na najsjevernijoj poziciji na vrtuljku i prvo slovo imena djeteta koje sjedi na najsjevernijoj poziciji nakon &scaron;to je vrtuljak stao.</p>

<p>Mjesec dana nakon veselog dana u cirkusu, Mirko se prisjeća promatranja djece na vrtuljku. Muči ga &scaron;to se ne može sjetiti točno gdje je koje dijete sjedilo na vrtuljku. Međutim, na&scaron;ao je svoj papirić na kojem je zapisao podatke o vrtnjama. Možete li mu pomoći rekonstruirati iz njegovog papirića gdje je tko sjedio na vrtuljku?</p>

### 입력

<p>U prvom su retku prirodni brojevi n (2 &le; n &le; 25) i m (1 &le; m &le; 100) iz teksta zadatka.</p>

<p>U svakom od sljedećih m redaka nalaze se podaci o vrtnjama redom kako su se događale. U svakom se retku nalazi broj p, broj promjena najsjevernijeg djeteta na vrtuljku u toj vrtnji, te veliko slovo engleske abecede koje odgovara prvom slovu imena djeteta koje je bilo najsjevernije nakon &scaron;to je vrtuljak stao u toj vrtnji.</p>

### 출력

<p>ko su Mirkovi podaci nekonzistentni, odnosno ako ne postoji ni jedan raspored djece na vrtuljku koji bi zadovoljavao Mirkove podatke, ispi&scaron;ite &rsquo;<code>!</code>&rsquo;.</p>

<p>Inače, ispi&scaron;ite niz slova koji predstavljaju raspored kako su djeca sjedila na vrtuljku u smjeru kazaljke na satu, počev&scaron;i od slova koje je zavr&scaron;ilo najsjevernije nakon zadnje vrtnje. Za svako mjesto na vrtuljku za koje nije moguće odrediti tko je tamo sjedio, ispi&scaron;ite &rsquo;<code>?</code>&rsquo;.</p>

### 힌트

<p>Poja&scaron;njenje prvog probnog primjera: Slika odgovara stanju vrtuljka nakon svih vrtnji.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26295.%E2%80%85Cirkularni%E2%80%85Cirkus/801a27ef.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/26295.%E2%80%85Cirkularni%E2%80%85Cirkus/801a27ef.png" data-original-src="https://upload.acmicpc.net/8e1cb9c3-3079-4ebe-b6f0-6b9b933d7bf3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 411px; height: 305px;" /></p>