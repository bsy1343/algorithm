# [Silver IV] Kryžiažodis - 30073

[문제 링크](https://www.acmicpc.net/problem/30073)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 60, 정답: 23, 맞힌 사람: 16, 정답 비율: 34.043%

### 분류

브루트포스 알고리즘, 구현, 문자열

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/99a5a811-b38c-45ca-9b59-ef1273ca96af/-/preview/" style="width: 163px; height: 236px; float: right;" />Brigita nusprendė sudaryti kryžiažodį savo jaunesniajam broliui, o kad užduotis nepasirodytų jam per sunki, kryžiažodis bus tik i&scaron; trijų žodžių. Tinkamas kryžiažodis tenkina &scaron;ias taisykles:</p>

<ul>
	<li>Kryžiažodyje žodžiai ra&scaron;omi eilute (horizontaliai) arba stulpeliu (vertikaliai)</li>
	<li>Jei du žodžiai kertasi (persidengia), jie kertasi ties lygiai viena raide</li>
	<li>Kiekvienas žodis kertasi su bent vienu kitu žodžiui, t.y. visi trys kryžiažodžio žodžiai susiję.</li>
	<li>Jei žodis kertasi su dviem kitais žodžiais, tai jis turi kirstis skirtingose vietose. Pavyzdžiui, žodis <code>KURMIS</code> su žodžiais <code>KAVA</code> ir <code>KELMAS</code> negali kirstis ties raide <code>K</code>.</li>
</ul>

<p>Padėkite Brigitai sudaryti kryžiažodį i&scaron; trijų pateiktų žodžių. Jei egzistuoja keli galimi sprendiniai, pateikite bet kurį.</p>

### 입력

<p>Trijose eilutėse įra&scaron;yta po vieną žodį, sudarytą i&scaron; didžiųjų lotyni&scaron;kų raidžių. Žodžiai tokie, kad i&scaron; pateiktų žodžių visada bus galima sudaryti taisykles tenkinantį kryžiažodį.</p>

### 출력

<p>Atskirose eilutėse i&scaron;veskite visų susikertančių žodžių poras ir raidžių numerius, kur jie kertasi: i&scaron;veskite pirmąjį žodį ir raidės, kur jis kertasi su antruoju, numerį, tada antrąjį žodį ir raidės, kur jis kertasi su pirmuoju, numerį.</p>

<p>Pavyzdžiui, jei žodžiai <code>VANDUO</code> ir <code>PIENAS</code> kryžiažodyje kertasi ties raide <code>A</code>, tai i&scaron;veskite: <code>VANDUO 2 PIENAS 5</code></p>