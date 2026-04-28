# [Silver V] Dviratininkas - 30350

[문제 링크](https://www.acmicpc.net/problem/30350)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 70, 정답: 54, 맞힌 사람: 41, 정답 비율: 89.130%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Vilius gyvena kaime, o į darbą mieste važiuoja dviračiu. &Scaron;iandien lyja, todėl Vilius nori atvykti į darbą kuo mažiau su&scaron;lapęs.</p>

<p>Į darbą Vilius važiuoja N kilometrų. Lietus permainingas, tad kiekvieną važiavimo kilometrą apibūdina su&scaron;lapimo stiprumas v<sub>i</sub>. Kuo v<sub>i</sub> didesnis, tuo daugiau Vilius su&scaron;laps. Viliaus su&scaron;lapimas atvykus į darbą lygus visų N kilometrų su&scaron;lapimo stiprumų sumai.</p>

<p>Kiekvieno kilometro pradžioje yra priemiestinio autobuso stotelė, kurioje Vilius gali įlipti į autobusą su dviračiu ir pavažiuoti vieną ar kelias stoteles, o toliau vėl važiuoti dviračiu, po to vėl įlipti į autobusą ir pan. Atstumas tarp gretimų stotelių &ndash; vienas kilometras. Suprantama, važiuodamas autobusu Vilius nesu&scaron;lampa.</p>

<p>Vilius &scaron;iai dienai i&scaron; anksto nusipirko K bilietų važiavimui autobusu su dviračiu. Vienas bilietas galioja lygiai vienai stotelei (vienam kilometrui), todėl Vilius pažymi bilietą kiekvienoje stotelėje, jeigu nusprendžia važiuoti autobusu toliau.</p>

<p>Nustatykite, kuriose stotelėse Vilius turi važiuoti autobusu ir pažymėti bilietus, kad su&scaron;laptų kuo mažiau.</p>

### 입력

<p>Pirmoje eilutėje pateikti du sveikieji skaičiai: kelio ilgis N ir turimų bilietų skaičius K. Tolesnėse N eilučių yra po sveikąjį skaičių, apibūdinantį su&scaron;lapimo stiprumą v<sub>i</sub> atitinkamame kilometre.</p>

### 출력

<p>Sprendinį turi sudaryti K eilučių. Kiekvienoje eilutėje turi būti po vieną skaičių &ndash; kurių kilometrų pradžioje Vilius turėtų pažymėti bilietus ir važiuoti autobusu, kad su&scaron;laptų mažiausiai.</p>

<p>Pateikiamų skaičių tvarka nesvarbi. Jei galimi keli sprendiniai, i&scaron;veskite bet kurį.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1 000</li>
	<li>1 &le; K &le; 5</li>
	<li>K &le; N</li>
	<li>1 &le; v<sub>i</sub> &le; 1 000</li>
</ul>