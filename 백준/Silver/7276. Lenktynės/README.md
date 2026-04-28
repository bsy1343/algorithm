# [Silver V] Lenktynės - 7276

[문제 링크](https://www.acmicpc.net/problem/7276)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 37, 맞힌 사람: 23, 정답 비율: 65.714%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Ralio lenktynėse dalyvavo N automobilių. Pasibaigus varžyboms, televizijos operatoriai nori sumontuoti visą nufilmuotą medžiagą. Svarbiausia &ndash; jie nori parodyti visus aplenkimus, kurie įvyko lenktynių metu. Tačiau bemontuodami medžiagą operatoriai susimai&scaron;ė: kaip sužinoti, ar visus aplenkimus jie sumontavo teisinga tvarka?</p>

<p>Jums žinomos pradinės automobilių pozicijos, bei eilė automobilių aplenkimų. Para&scaron;ykite programą, kuri nustatytų, ar duoti aplenkimai galėjo įvykti tokia tvarka.</p>

### 입력

<p>Pirmoje eilutėje įra&scaron;ytas automobilių skaičius N, o antroje &ndash; automobilių numeriai, įra&scaron;yti tokia tvarka, kokia jie startavo (pirmasis startavęs automobilis įra&scaron;ytas pirmas). Visi automobilių numeriai yra skirtingi sveikieji skaičiai nuo 1 iki N.</p>

<p>Tolimesnėje eilutėje įra&scaron;ytas lenkimų skaičius L. Toliau pateikta L eilučių kuriose įra&scaron;yta po skaičių porą (a<sub>i</sub>, b<sub>i</sub>), žyminčią, kad automobilis a<sub>i</sub> aplenkė automobilį b<sub>i</sub>. Skaičių poros įra&scaron;ytos tokia tvarka, kokia buvo sumontuota operatorių įra&scaron;e. Galite būti tikri, kad lenktynių metu įvyko bent vienas lenkimas.</p>

### 출력

<p>Jei lenktynės galėjo vykti tokia eiga, kokia yra pateikta, pirmoje eilutėje i&scaron;veskite žodį <code>TAIP</code>, o antroje &ndash; galutinę automobilių tvarką, tokiu pačiu formatu, kaip ir pradiniuose duomenyse.</p>

<p>Jei operatoriai padarė klaidą montuodami, pirmoje eilutėje i&scaron;veskite žodį <code>NE</code>, o antroje numerį lenkimo, kuris yra neįmanomas (t.y. automobilis a<sub>i</sub> negalėjo aplenkti b<sub>i</sub> tuo metu).</p>

### 제한

<ul>
	<li>1 &lt; N &le; 1 000</li>
	<li>1 &le; L &le; 100 000</li>
</ul>