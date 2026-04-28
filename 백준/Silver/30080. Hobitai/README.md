# [Silver II] Hobitai - 30080

[문제 링크](https://www.acmicpc.net/problem/30080)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 20, 맞힌 사람: 15, 정답 비율: 50.000%

### 분류

자료 구조, 그리디 알고리즘, 문자열, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30080.%E2%80%85Hobitai/eff25b1b.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/30080.%E2%80%85Hobitai/eff25b1b.png" data-original-src="https://upload.acmicpc.net/b175f3b1-e57d-4ae9-b3fc-9c617ea42f3d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 233px; height: 87px; float: right;" />Saulėtoje kalno pusėje savo namus turi $N$ hobitų. Kiekvienas hobitas gyvena vienas savo atskirame namuke. Hobitai būna arba <em>herbivorai</em> (&bdquo;H&ldquo;), t. y. valgantys tik vaisius ir daržoves, arba <em>omnivorai</em> (&bdquo;O&ldquo;), t. y. valgantys viską.</p>

<p>Prie&scaron;piečiams hobitai nori užsisakyti savo mėgstamų užkandžių i&scaron; maisto pristatymo traukinuko. Traukinuką sudaro $8$ maisto vagonėliai, galintys vienu metu atvežti maisto į a&scaron;tuonis greta vienas kito esančius hobitų namukus (t. y. hobaitą). Norint užtikrinti efektyvų &scaron;io traukinuko darbą, reikia laikytis &scaron;ių reikalavimų:</p>

<ul>
	<li>Užsakinėjant maistą kiekvienam i&scaron; $8$ vagonėlių reikia nurodyti, kokią virtuvę &ndash; herbivorų ar omnivorų &ndash; tas vagonėlis turėtų tiekti.</li>
	<li>Traukinukas važiuos palei kalną tol, kol visi vagonėliai atsidurs ties tinkamos rū&scaron;ies dar neaptarnautų hobitų namukais, ir visus a&scaron;tuonis namukus aptarnaus vienu metu. Tada traukinukas tęs kelionę toliau, iki kol vėl atsidurs tinkamoje padėtyje, aptarnaus kitą hobaitą, ir taip toliau. Pastaba: nors omnivorai ir yra visavalgiai, tačiau jie nesutinka valgyti herbivorams skirto maisto.</li>
	<li>Traukinukas negali apvažiuoti kalno ratu: pravažiavęs paskutinį namuką jis važiuoja ilsėtis į garažą ir toliau maistą pristatinės tik kitą dieną. Per dieną priimamas tik vienas užsakymas.</li>
</ul>

<p>Raskite, kiek daugiausiai hobitų galima pamaitinti vienu užsakymu, ir koks tas užsakymas turėtų būti.</p>

### 입력

<p>Pirmoje eilutėje pateiktas sveikasis skaičius $N$.</p>

<p>Antroje eilutėje pateikiama $N$ simbolių eilutė. Kiekvienas jos simbolis bus arba raidė &bdquo;H&ldquo;, arba raidė &bdquo;O&ldquo;. &Scaron;i eilutė nurodo namukų i&scaron;sidėstymo tvarką: &bdquo;H&ldquo; raidė žymi namuką, kuriame gyvenantis hobitas yra herbivoras, o &bdquo;O&ldquo; &ndash; omnivoras.</p>

### 출력

<p>Pirmoje eilutėje i&scaron;veskite vieną sveikąjį skaičių: kiek daugiausiai hobitų gali būti aptarnauti vienu traukinuko užsakymu.</p>

<p>Antroje eilutėje i&scaron;veskite tokio užsakymo pavyzdį: $8$ simbolius, kurių kiekvienas būtų &bdquo;H&ldquo; arba &bdquo;O&ldquo;, nurodantys, kokio tipo užkandžius turėtų tiekti atitinkami vagonėliai. Vagonėlių i&scaron;sidėstymas nurodomas tokia pačia tvarka, kokia ir hobitų namukų i&scaron;sidėstymas.</p>

<p>Jei yra keli galimi atsakymo variantai, i&scaron;veskite bet kurį.</p>

### 제한

<ul>
	<li>$8 &le; N &le; 1\,000\,000$</li>
</ul>