# [Bronze II] Paskaitos - 30282

[문제 링크](https://www.acmicpc.net/problem/30282)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 96, 정답: 49, 맞힌 사람: 45, 정답 비율: 49.451%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Artūras &scaron;iemet baigė mokyklą ir labai džiaugiasi įstojęs į prestižinį universitetą. Pirmas darbas, kurį turėjo atlikti Artūras nuvykęs į universitetą &ndash; i&scaron;sirinkti 10 pasirenkamųjų dalykų, kuriuos jis studijuos universitete pirmą semestrą.</p>

<p>Artūras pasirinko de&scaron;imt dalykų, tačiau vėliau susimąstė, ar nesidubliuos paskaitų laikai, t. y. ar nei&scaron;sirinko jis tokių dalykų, kurių paskaitos vyksta tuo pačiu metu.</p>

<p>Jei tuo pačiu metu viena paskaita baigiasi, o kita prasideda (sutampa pabaigos ir pradžios laikas), tokios paskaitos laikomos nesidubliuojančiomis.</p>

<p>Padėkite Artūrui i&scaron;siai&scaron;kinti, ar jis galės lankyti visus pasirinktus dalykus.</p>

### 입력

<p>Pradinius duomenis sudaro 10 eilučių su informacija apie Artūro pasirinktus studijuoti dalykus.</p>

<p>Kiekvienoje eilutėje yra pateikiami penki skaičiai: savaitės dienos numeris s (1 &ndash; pirmadienis, 2 &ndash; antradienis, ..., 5 &ndash; penktadienis), paskaitos pradžios laikas (valanda h<sub>pr</sub> ir minutės m<sub>pr</sub>) ir pabaigos laikas (valanda h<sub>pb</sub> ir minutės m<sub>pb</sub>).</p>

### 출력

<p>Jeigu Artūras galės lankyti visas paskaitas, tuomet i&scaron;veskite žodį <code>TAIP</code> bei bendrą paskaitų trukmę valandomis ir minutėmis.</p>

<p>Jeigu kurių nors pasirinktų paskaitų laikai dubliuosis, tuomet i&scaron;veskite žodį <code>NE</code> bei dviejų dalykų, kurių užsiėmimai dubliuosis, numerius. Laikykite, kad pasirinkti dalykai sunumeruoti nuo 1 iki 10.</p>

<p>Jei galimi keli atsakymo variantai, i&scaron;veskite bet kurį.</p>

### 제한

<ul>
	<li>1 &le; s &le; 5</li>
	<li>8 &le; h<sub>pr</sub>, h<sub>pb</sub> &le; 16</li>
	<li>0 &le; m<sub>pr</sub>, m<sub>pb</sub> &le; 59</li>
</ul>