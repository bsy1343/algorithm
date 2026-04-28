# [Gold V] Dviratis - 30199

[문제 링크](https://www.acmicpc.net/problem/30199)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Aleksas gyvena dideliame mieste. Prie&scaron; porą mėnesių, paveiktas pandemijos, jis nusprendė pakeisti gyvenimo būdą ir į darbą pradėti važinėti dviračiu. &bdquo;Taip ir man sveikiau, ir planetai geriau.&ldquo; &ndash; samprotavo Aleksas.</p>

<p>Tačiau viskam yra ribos. Aleksas yra pasiryžęs važiuoti dviračiu tik tada, kai nelyja. Jis taip pat gali nuspręsti palikti savo dviratį darbe ir grįžti namo vie&scaron;uoju transportu, jei vakare pradeda lyti. Taigi, Aleksas elgiasi taip:</p>

<ul>
	<li>Ryte, jeigu lyja arba Alekso dviratis ne namie, jis važiuoja į darbą vie&scaron;uoju transportu. Prie&scaron;ingu atveju, jis gali važiuoti į darbą dviračiu (bet gali ir vie&scaron;uoju transportu).</li>
	<li>Vakare, jeigu lyja arba Alekso dviratis ne darbe, jis grįžta namo vie&scaron;uoju transportu. Prie&scaron;ingu atveju, jis gali grįžti namo dviračiu (bet gali ir vie&scaron;uoju transportu).</li>
</ul>

<p>Aleksas stebi orų prognozę ir norėtų susiplanuoti savo keliones taip, kad kuo daugiau dienų jis pasinaudotų dviračiu bent vieną kartą (t. y. ryte, vakare, arba abu kartus).</p>

<p>Duota orų prognozė ateinančioms N dienų. Raskite, kiek daugiausiai dienų Aleksas galės važiuoti dviračiu.</p>

### 입력

<p>Pirmoje eilutėje pateiktas dienų skaičius N.</p>

<p>Tolesnėse N eilučių sura&scaron;ytos orų prognozės ateinančioms N dienų. Kiekvieną eilutę sudaro du sveikieji skaičiai r<sub>i</sub> ir v<sub>i</sub>:</p>

<ul>
	<li>r<sub>i</sub> lygus 1, jei i-osios dienos ryte nelis (galima važiuoti dviračiu), ir 0 prie&scaron;ingu atveju.</li>
	<li>v<sub>i</sub> lygus 1, jei i-osios dienos vakare nelis (galima važiuoti dviračiu), ir 0 prie&scaron;ingu atveju.</li>
</ul>

### 출력

<p>I&scaron;veskite vienintelį sveiką skaičių: kiek daugiausiai dienų Aleksas galės važiuoti dviračiu.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1 000 000</li>
</ul>

### 힌트

<p>Pirmąją dieną Alekso dviratis visuomet yra namie. Pasibaigus N dienų, Alekso dviratis gali būti tiek namie, tiek paliktas darbe.</p>