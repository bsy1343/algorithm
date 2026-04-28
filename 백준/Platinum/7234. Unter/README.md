# [Platinum V] Unter - 7234

[문제 링크](https://www.acmicpc.net/problem/7234)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 5, 맞힌 사람: 5, 정답 비율: 14.286%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 함수형 그래프, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Justas planuoja sukurti programėlę, leidžiančią žmonėms dalintis kelionėmis automobiliu. Pirmiausia jam reikia para&scaron;yti programą, kuri leistų rasti trumpiausią atstumą tarp dviejų namų.</p>

<p>Mieste, kuriame veiks programėlė, yra N namų, sunumeruotų nuo 1 iki N. Namus tiesiogiai jungia N dvikrypčių gatvių. Viena gatvė jungia lygiai du namus ir du namus jungia ne daugiau kaip viena gatvė.</p>

<p>Justas jau para&scaron;ė algoritmą, kuris leidžia rasti trumpiausią kelią tarp dviejų namų, kai yra tik vienas būdas nuvažiuoti i&scaron; vieno namo į kitą, nevažiuojant pro tą patį namą daugiau nei kartą. Tačiau jam reikia jūsų pagalbos rasti trumpiausią kelią tarp tokių namų porų, tarp kurių nuvažiuoti yra daugiau nei vienas toks būdas.</p>

<p>Raskite trumpiausią atstumą tarp Q namų porų.</p>

### 입력

<p>Pirmoje eilutėje pateikiami du sveikieji skaičiai: namų skaičius N ir užklausų skaičius Q.</p>

<p>Tolimesnėse N eilučių pateikiama po du tarpu atskirtus sveikuosius skaičius a<sub>i</sub> ir b<sub>i</sub>. &Scaron;ie skaičiai nurodo, kad mieste egzistuoja gatvė tarp namų a<sub>i</sub> ir b<sub>i</sub>.</p>

<p>Likusiose Q eilučių pateikiama po du tarpu atskirtus sveikuosius skaičius c<sub>j</sub> ir d<sub>j</sub>.</p>

### 출력

<p>I&scaron;veskite Q eilučių. k-toje eilutėje pateikite vieną skaičių &ndash; trumpiausio kelio tarp namų c<sub>k</sub> ir d<sub>k</sub> ilgį. Atstumą tarp dviejų namų Justas skaičiuoja kaip gatvių, kuriomis reikia važiuoti, skaičių.</p>

### 제한

<ul>
	<li>3 &le; N &le; 200 000</li>
	<li>1 &le; a<sub>i</sub>, b<sub>i</sub> &le; N (1 &le; i &le; N, a<sub>i</sub> &ne; b<sub>i</sub>)</li>
	<li>1 &le; Q &le; 1 000 000</li>
	<li>1 &le; c<sub>j</sub>, d<sub>j</sub> &le; N (1 &le; j &le; Q, c<sub>j</sub> &ne; d<sub>j</sub>).</li>
	<li>I&scaron; c<sub>j</sub> į d<sub>j</sub> galima patekti daugiau nei vienu (nebūtinai trumpiausiu) keliu, kuris pro jokį namą neina daugiau negu vieną kartą.</li>
	<li>I&scaron; bet kurio namo gatvėmis visada bus galima nukeliauti iki bet kurio kito namo.</li>
</ul>