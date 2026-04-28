# [Gold IV] Traukinys - 30276

[문제 링크](https://www.acmicpc.net/problem/30276)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 29, 맞힌 사람: 19, 정답 비율: 61.290%

### 분류

그리디 알고리즘

### 문제 설명

<p>Dabar pats slidinėjimo sezonas! Traukinių stotis ūžia nuo slidinėti važiuojančių poilsiautojų. Bijodami nepavėluoti į traukinį, keleiviai sulipo į vagonus nežiūrėdami, kur yra laisvos vietos.</p>

<p>Kiekviename traukinio vagone yra po K sėdimų vietų, o i&scaron; viso traukinyje sėdimų vietų yra lygiai tiek, kiek keleivių &ndash; taip jau būna &scaron;iuo metų laiku.</p>

<p>Žinodami, kiek keleivių įlipo į kiekvieną i&scaron; vagonų, raskite, kiek mažiausiai vagonų keleiviai turės pereiti sumoje, kad kiekvienas keleivis galėtų atsisėsti.</p>

### 입력

<p>Pirmoje eilutėje pateikiami du sveikieji skaičiai: traukinio vagonų skaičius N ir kiekviename vagone esančių sėdimų vietų skaičius K. Antroje eilutėje pateikta N skaičių a<sub>i</sub>, kur a<sub>i</sub> &ndash; į i-tąjį vagoną įlipusių keleivių skaičius.</p>

<p>Laikykite, jog a<sub>1</sub> + a<sub>2</sub> + . . . + a<sub>N</sub> = N &middot; K.</p>

### 출력

<p>I&scaron;veskite vieną sveikąjį skaičių &ndash; kiek mažiausiai vagonų keleiviai turės pereiti sumoje, kad kiekvienas keleivis galėtų atsisėsti.</p>

<p>atsakymas gali būti skaičius vir&scaron;ijantis 32 bitų sveikojo skaičiaus ribas. Atsakymui saugoti naudokite 64 bitų tipo skaičių (<code>long long</code> C/C++, <code>Int64</code> Pascal).</p>

### 제한

<ul>
	<li>1 &le; N &le; 1 000 000</li>
	<li>1 &le; K &le; 1 000 000</li>
</ul>