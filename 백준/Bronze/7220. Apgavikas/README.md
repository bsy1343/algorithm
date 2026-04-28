# [Bronze I] Apgavikas - 7220

[문제 링크](https://www.acmicpc.net/problem/7220)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 78, 정답: 52, 맞힌 사람: 30, 정답 비율: 62.500%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Martynas kartu su N draugų žaidžia kompiuterinį žaidimą &bdquo;Apgavikas&ldquo;. Veiksmas vyksta kosminiame laive, kurį sudaro M kambarių. Žaidimo pradžioje kiekvienas slaptai gauna rolę: vienas žaidėjas būna apgavikas, o kiti &ndash; įgulos nariai.</p>

<p>Įgulos tikslas yra i&scaron;siai&scaron;kinti apgaviką neapleidžiant laivo užduočių, o apgaviko &ndash; likti vieninteliam laive.</p>

<p>&bdquo;Apgavikas&ldquo; žaidžiamas turais. Turo metu:</p>

<ol>
	<li>Kiekvienas žaidėjas nueina į jam &scaron;iam turui paskirtą kambarį.</li>
	<li>Įgulos nariai atlieka jiems paskirtas kosminio laivo priežiūros užduotis.</li>
	<li>Apgavikas parenka auką, esančią tame pačiame kambaryje kaip ir jis, ir ją pa&scaron;alina i&scaron; kosminio laivo. Apgavikui visada paskiriamas kambarys, kuriame jis bus ne vienas.</li>
	<li>Visi, esantys kambaryje kartu su apgaviku, mato, kaip jis pa&scaron;alina žaidėją. Taigi jie sužino, kuris žaidėjas yra apgavikas, ir žino tai visą likusį žaidimo laiką.</li>
	<li>Po turo visi likę kosminiame laive žaidėjai i&scaron;eina i&scaron; kambarių ir kiekvienas balsuoja spusteldamas raudoną arba geltoną mygtuką. Žinantys, kas yra apgavikas, spusteli raudoną mygtuką, nežinantys &ndash; geltoną.</li>
	<li>Jei spustelėta daugiau raudonų mygtukų, nei geltonų &ndash; apgavikas demaskuojamas, jis pralaimi žaidimą ir žaidimas stabdomas.</li>
</ol>

<p>Apgavikas laimi žaidimą, jei pa&scaron;alinami visi N žaidėjų, o jis (t.y. (N + 1)-asis žaidėjas) vienintelis lieka žaidime.</p>

<p>Pavyzdinę žaidimo eigą galite pamatyti žemiau pateiktame pavyzdyje.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/7220.%E2%80%85Apgavikas/322f23c7.png" data-original-src="https://upload.acmicpc.net/7e41c1db-a34b-4728-9981-97699fcad488/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 310px; height: 317px;" /></p>

<p>Martynas sužinojo, kad naujai žaidžiamame žaidime jis bus apgavikas, bei tai, kuris žaidėjas į kokį kambarį bus siunčiamas kiekvieno turo metu.</p>

<p>Martynas i&scaron;analizavo &scaron;iuos duomenis ir i&scaron; anksto suplanavo, kurį žaidėją pa&scaron;alins kiekvieno turo metu.</p>

<p>Nustatykite, ar pavyks Martynui laimėti žaidimą, o jei nepavyks &ndash; kurio turo metu jis bus pa&scaron;alintas i&scaron; žaidimo.</p>

### 입력

<p>Pirmojoje pradinių duomenų eilutėje pateikti du teigiami sveikieji skaičiai &ndash; žaidėjų, kurie nėra apgavikai, skaičius N, ir kambarių skaičius M.</p>

<p>Antrojoje eilutėje pateikti N skirtingų sveikųjų teigiamų skaičių p<sub>i</sub> &ndash; žaidėjų, kuriuos Martynas pa&scaron;alins i-ojo turo metu, numeriai.</p>

<p>Toliau pateikta N eilučių po N sveikųjų teigiamų skaičių: i-oje eilutėje j-asis skaičius atitinka k<sub>i,j</sub> &ndash; į kurį kambarį i-ojo turo metu eis j-asis žaidėjas, jei dar nebus pa&scaron;alintas iki to laiko.</p>

### 출력

<p>I&scaron;veskite vieną teigiamą sveikąjį skaičių: N, jei Martynas laimės žaidimą, kitu atveju &ndash; turo, kurio metu Martynas bus pa&scaron;alintas, numerį.</p>

### 제한

<ul>
	<li>1 &le; N, M &le; 1 000</li>
	<li>1 &le; k<sub>i,j</sub> &le; M</li>
	<li>1 &le; p<sub>i</sub> &le; N</li>
</ul>