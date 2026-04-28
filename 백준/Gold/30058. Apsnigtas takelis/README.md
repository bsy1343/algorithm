# [Gold IV] Apsnigtas takelis - 30058

[문제 링크](https://www.acmicpc.net/problem/30058)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 23, 맞힌 사람: 18, 정답 비율: 64.286%

### 분류

누적 합, 차분 배열 트릭

### 문제 설명

<p>Latvijoje &scaron;ią žiemą sninga ypač dažnai. Vakar vakare Mārtiņ&scaron; &scaron;variai nuvalė taką, vedantį link jo namų, o &scaron;įryt vos pabudęs pažvelgė pro langą ir atsiduso &ndash; takas vėl apsnigtas. Apskaičiuokite, kiek energijos Mārtiņ&scaron; sunaudos &scaron;iandien kasdamas sniegą nuo tako.</p>

<p>Takas yra tiesi $N$ metrų ilgio atkarpa. Jį dengiantis sniego sluoksnis nėra tolygus &ndash; pirmąjį tako metrą dengia $a_1$ centimetrų gylio sniegas, antrajį &ndash; $a_2$ centimetrų, ..., paskutinįjį metrą &ndash; $a_N$ centimetrų.</p>

<p>Mārtiņ&scaron; takelį pradeda valyti nuo pirmojo metro. Jis semtuvu pasemia visą ten esantį sniegą bei &scaron;vysteli jį auk&scaron;tyn ir tolyn nuo savęs. Sniegas nusileidžia vėl ant tako ir padengia kelis artimiausius metrus vieno centimetro gylio sluoksniu. Nagrinėkime pavyzdį.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30058.%E2%80%85Apsnigtas%E2%80%85takelis/87a3f2fc.png" data-original-src="https://upload.acmicpc.net/ee4d58d2-5f32-4b6c-b70d-b823f68484c0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 198px; height: 123px;" /></p>

<p style="text-align: center;">1 pav. Trijų centrimetrų sniego sluoksnis pasklinda trijų metrų intervale.</p>

<p>Nuvalęs pirmąjį metrą, Mārtiņ&scaron; pereina prie antrojo: meta ten tuo metu esantį sniegą auk&scaron;tyn, o jis vėl vieno centimetro sluoksniu padengia kelis artimiausius metrus. Tada Mārtiņ&scaron; valo trečiąjį metrą, ketvirtąjį ir taip toliau, kol galiausiai sniego ant tako nelieka. Taigi, pavyzdys tęsiasi taip:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30058.%E2%80%85Apsnigtas%E2%80%85takelis/bea4a146.png" data-original-src="https://upload.acmicpc.net/0bc33058-d17a-4257-b926-65f11949acfe/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 561px; height: 67px;" /></p>

<p style="text-align: center;">2 pav. Tako valymas. Atkreipkite dėmesį, kad už ribų nukritęs sniegas ten ir lieka.</p>

<p>Kiekvieną kartą mesdamas auk&scaron;tyn $a$ centimetrų sniego Mārtiņ&scaron; sunaudoja $a$ energijos vienetų. Pateiktame pavyzdyje jis i&scaron; viso sunaudoja $3 + 2 + 4 + 3 + 3 = 15$ energijos vienetų.</p>

### 입력

<p>Pirmoje eilutėje pateikiamas sveikasis skaičius $N$ &ndash; tako ilgis.</p>

<p>Antroje eilutėje pateikiama $N$ tarpais atskirtų sveikųjų skaičių &ndash; $a_1, a_2, \dots , a_N$, kurie apra&scaron;o taką dengiančio sniego gylį.</p>

### 출력

<p>I&scaron;veskite vieną skaičių &ndash; energijos, kurią Mārtiņ&scaron; i&scaron;eikvos, kiekį.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 1\,000\,000$</li>
	<li>$0 &le; a_i &le; 1\,000\,000\,000$</li>
</ul>