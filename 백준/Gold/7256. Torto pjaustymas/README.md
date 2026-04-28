# [Gold IV] Torto pjaustymas - 7256

[문제 링크](https://www.acmicpc.net/problem/7256)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

(분류 없음)

### 문제 설명

<p>Artūro gimtadieniui draugai i&scaron;kepė stačiakampį tortą, papuo&scaron;tą K žvakučių &ndash; tiek, kiek Artūrui sukanka metų. Kadangi tortas i&scaron;margintas languotu ra&scaron;tu, galime laikyti jį M &times; N formos stačiakampiu. Kai kuriuose langeliuose yra lygiai viena žvakutė, o kituose žvakutės nėra.</p>

<p>Draugai skyrė Artūrui užduotį &ndash; pagal pateiktas taisykles atpjauti gabalą torto. Taisyklės tokios:</p>

<ul>
	<li>Pirmu horizontaliu arba vertikaliu pjūviu, einančiu per langelių kra&scaron;tus, tortas padalinamas į du stačiakampius gabalus. Gauti gabalai turi būti vienodo dydžio ir turėti po lygiai žvakučių.</li>
	<li>Vieną i&scaron; gabalų Artūras atideda į &scaron;alį, o likusį pjausto toliau pagal tas pačias taisykles.</li>
	<li>Kai lieka gabalas, kurio toliau pjauti nebeįmanoma, jei tas gabalas turi lygiai vieną žvakutę, jis atitenka Artūrui. Jei ne, Artūras torto negauna.</li>
</ul>

<p>Pavyzdžiui, toks 4&times;8 tortas vertikaliu pjūviu gali būti padalintas į du 4&times;4 gabalus, turinčius po dvi žvakutes. Pirmas pjūvis negali būti horizontalus, nes pjaunant per vidurį vir&scaron;utinis gabalas turės tris žvakutes, o apatinis &ndash; tik vieną.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7256.%E2%80%85Torto%E2%80%85pjaustymas/b585ae1b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7256.%E2%80%85Torto%E2%80%85pjaustymas/b585ae1b.png" data-original-src="https://upload.acmicpc.net/ace3e415-2adc-400c-8252-e7ef63f6265f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 314px; height: 76px;" /></p>

<p>De&scaron;iniojo gabalo toliau pjaustyti negalima, ir jis turi dvi žvakutes. Jį pasilikęs Artūras torto negautų. Kairįjį gabalą galima pjauti tiek horizontaliai, tiek vertikaliai.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7256.%E2%80%85Torto%E2%80%85pjaustymas/70cca92a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7256.%E2%80%85Torto%E2%80%85pjaustymas/70cca92a.png" data-original-src="https://upload.acmicpc.net/90ec5803-c049-434c-aeb3-69a1cd01b20a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 438px; height: 90px;" /></p>

<p>Pjaunant abiem būdais, gauti gabalai turi po vieną žvakutę, todėl bet kuris i&scaron; jų gali atitekti Artūrui.</p>

<p>Taigi &scaron;iame pavyzdyje Artūrui gali atitekti vienas i&scaron; keturių skirtingų gabalų.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7256.%E2%80%85Torto%E2%80%85pjaustymas/67c34e09.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7256.%E2%80%85Torto%E2%80%85pjaustymas/67c34e09.png" data-original-src="https://upload.acmicpc.net/0943ada3-37d3-4a3f-81cc-4bd8b3ba923a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 541px; height: 74px;" /></p>

<p>Suskaičiuokite, kiek skirtingų gabalų gali atitekti Artūrui. Gabalai laikomi skirtingais, jei jie užima skirtingą poziciją torte.</p>

### 입력

<p>Pirmoje eilutėje pateikiami trys sveikieji skaičiai: torto auk&scaron;tis M, plotis N ir žvakučių skaičius K.</p>

<p>Kitose K eilučių pateikiamos langelių su žvakutėmis koordinates. Pirmoji koordinatė yra vertikalioji (numeruojama nuo 0 iki M &minus; 1 i&scaron; vir&scaron;aus į apačią), o antroji &ndash; horizontalioji (nuo 0 iki N &minus; 1 i&scaron; kairės į de&scaron;inę).</p>

<p>Langeliai nesikartoja.</p>

### 출력

<p>I&scaron;veskite vieną skaičių, nurodantį, kiek skirtingų gabalų gali atitekti Artūrui.</p>

### 제한

<ul>
	<li>1 &le; M, N &le; 1000 000 000</li>
	<li>1 &le; K &le; 100 000</li>
	<li>o žvakučių skaičius nevir&scaron;ija langelių skaičiaus (t.y. K &le; MN).</li>
</ul>