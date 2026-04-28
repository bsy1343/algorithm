# [Gold IV] Plaukimo varžybos - 7267

[문제 링크](https://www.acmicpc.net/problem/7267)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 12, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬

### 문제 설명

<p>Lietuvos atvirosiose mokinių plaukimo varžybose gali dalyvauti visi norintys mokiniai. Kadangi i&scaron;ankstinė registracija nėra būtina, organizatoriai niekada nežino, kiek gali sulaukti norinčiųjų varžytis.</p>

<p>Nors baseine yra 8 plaukimo takeliai, &scaron;į kartą mokinių atvyko mažiau nei buvo tikėtasi, todėl organizatoriai nusprendė juos paskirstyti į mažesnes grupes po ne mažiau nei A ir ne daugiau nei B vienoje.</p>

<p>Taip pat organizatoriai siekia, kad kiekvienas plaukimas būtų kuo įdomesnis ir jame dalyvautų kuo pana&scaron;esnio pajėgumo sportininkai.</p>

<p>Para&scaron;ykite programą, kuri suskirstytų atvykusius mokinius į plaukimus taip, kad absoliutus skirtumas tarp bent kuriame plaukime dalyvaujančių lėčiausio ir greičiausio plaukikų vidutinių distancijos įveikimo laikų būtų kuo mažesnis.</p>

### 입력

<p>Pirmojoje eilutėje pateikti trys skaičiai atskirti tarpu: į varžybas atvykusių dalyvių skaičius (N) bei minimalus (A) ir maksimalus (B) viename plaukime galinčių dalyvauti plaukikų skaičius.</p>

<p>Tolimesnėse N eilučių didėjimo tvarka pateikti laikai t<sub>i</sub>, per kurį vidutini&scaron;kai kiekvienas plaukikas įveikia distanciją (t<sub>i</sub> &le; t<sub>i+1</sub>).</p>

<p>Pradiniai duomenys visada bus tokie, kad sprendinys egzistuos.</p>

### 출력

<p>Jums reikia i&scaron;vesti vieną skaičių &ndash; didžiausią laiko skirtumą tarp vieno plaukimo lėčiausio ir greičiausio dalyvių.</p>

### 제한

<ul>
	<li>2 &le; N &le; 500 000</li>
	<li>2 &le; A &le; B &le; 8</li>
	<li>1 &le; t<sub>i</sub> &le; 1 000 000</li>
</ul>