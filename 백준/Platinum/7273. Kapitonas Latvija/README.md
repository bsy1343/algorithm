# [Platinum V] Kapitonas Latvija - 7273

[문제 링크](https://www.acmicpc.net/problem/7273)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 66, 정답: 6, 맞힌 사람: 4, 정답 비율: 7.273%

### 분류

수학, 자료 구조, 기하학, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Martynas yra milžini&scaron;kas komiksų fanas. Jo mėgstamiausias &ndash; Kapitonas Latvija. Tokiam populiariam komiksui net yra sukurtas žaidimas, kurį Martynas žaidžia savo telefone. &Scaron;iame žaidime Kapitonas Latvija savo žymiuoju skydu bando numu&scaron;ti kuo daugiau prie&scaron;ų, kurie pasiskirstę begaliniame koridoriuje.</p>

<p>Koridorių galima įsivaizduoti kaip begalinį stačiakampį, kuris turi dvi begalines &scaron;onines sienas ir vieną paprastą apatinę sieną, statmeną &scaron;oninėms. Apatinė siena yra ilgio L atkarpa, kuri prasideda ta&scaron;ke (0; 0) ir baigiasi ta&scaron;ke (L; 0). Kairioji ir de&scaron;inioji &scaron;oninės sienos yra spinduliai, kurie prasideda atitinkamai ta&scaron;kuose (0; 0) ir (0;L) ir tęsiasi teigiama y a&scaron;ies kryptimi, statmenai apatinei sienai.</p>

<p>Koridoriuje yra N prie&scaron;ų. i-tasis prie&scaron;as stovi ta&scaron;ke (x<sub>i</sub>; y<sub>i</sub>), (0 &lt; x<sub>i</sub> &lt; L). Kapitonas Latvija stovi prie pat apatinės sienos, ta&scaron;ke (X; 0), (0 &lt; X &lt; L) ir i&scaron; ten nejudėdamas mėto savo skydą.</p>

<p>Kapitonas gali mesti savo skydą bet kokia kryptimi į vieną i&scaron; dviejų &scaron;oninių sienų. Pirmą kartą atsitrenkęs į sieną, skydas nuo jos at&scaron;oka ir skrenda toliau link kitos sienos. Kai atsitrenkia į antrą sieną, skydas tiesia linija skrenda atgal pas Kapitoną Latviją. Skrisdamas tokia trikampio formos trajektorija skydas numu&scaron;a visus prie&scaron;us, kurie stovi ant to trikampio kra&scaron;tinių.</p>

<p>Martynui įdomu, kiek daugiausiai prie&scaron;ų įmanoma numu&scaron;ti vienu metimu, bet jam reikia jūsų pagalbos.</p>

<p>Žinodami koridoriaus matmenis, prie&scaron;ų ir Kapitono Latvija koordinates nustatykite, kiek daugiausiai prie&scaron;ų galima numu&scaron;ti vienu skydo metimu.</p>

### 입력

<p>Pirmojoje eilutėje pateikti du sveikieji skaičiai L ir N &ndash; koridoriaus apatinės sienos ilgis ir prie&scaron;ų skaičius. Antrojoje eilutėje pateiktas vienas sveikasis skaičius X &ndash; Kapitono Latvijos x koordinatė. Toliau seka N eilučių. i-tojoje i&scaron; jų įra&scaron;yti du tarpu atskirti skaičiai x<sub>i</sub> ir y<sub>i</sub> &ndash; i-tojo prie&scaron;o koordinatės.</p>

### 출력

<p>I&scaron;veskite vieną sveikąjį skaičių &ndash; kiek daugiausiai prie&scaron;ų galima numu&scaron;ti vienu skydo metimu.</p>

### 제한

<ul>
	<li>1 &le; N &le; 10<sup>5</sup></li>
	<li>2 &le; L &le; 10<sup>5</sup></li>
	<li>0 &lt; X &lt; L</li>
	<li>0 &lt; x<sub>i</sub> &lt; L</li>
	<li>0 &lt; y<sub>i</sub> &le; 10<sup>5</sup></li>
</ul>