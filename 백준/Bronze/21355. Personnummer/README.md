# [Bronze II] Personnummer - 21355

[문제 링크](https://www.acmicpc.net/problem/21355)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 190, 정답: 126, 맞힌 사람: 114, 정답 비율: 65.517%

### 분류

구현, 문자열, 많은 조건 분기, 파싱

### 문제 설명

<p>Svenska personnummer skrivs oftast med tio siffror p&aring; formatet <code>&Aring;&Aring;MMDD-XXXX</code>. De sex f&ouml;rsta siffrorna utg&ouml;r personens f&ouml;delsedatum, s&aring; en person med personnummer 781113-3285 &auml;r t.ex.&nbsp;f&ouml;dd den 13:e november 1978. En detalj som m&aring;nga inte k&auml;nner till &auml;r att hundraplussare f&aring;r ett plustecken ist&auml;llet f&ouml;r bindestreck i sitt personnummer. Detta &auml;r f&ouml;r att man inte ska blanda ihop dem med personer som f&ouml;ddes exakt $100$ &aring;r senare. Till exempel kan n&aring;gon som f&ouml;ddes &aring;r 1912 ha personnummret 121212+1212, medan 121212-1212 tillh&ouml;r n&aring;gon som f&ouml;ddes 2012.&nbsp;</p>

<p>Skriv ett program som l&auml;ser in ett personnummer p&aring; formatet ovan, och skriver ut det p&aring; <em>tolvsiffrigt</em> format, d.v.s.&nbsp;<code>&Aring;&Aring;&Aring;&Aring;MMDDXXXX</code>. Du kan anta att personerna i indatan f&ouml;ddes mellan 1840 och 2019. F&ouml;r enkelhets skull kommer det inte heller finnas n&aring;gra personer som f&ouml;ddes 1920.&nbsp;</p>

### 입력

<p>En str&auml;ng best&aring;ende av siffror, bindestreck och plustecken, p&aring; formatet ovan.</p>

### 출력

<p>Skriv ut en str&auml;ng, personnumret i indatan omvandlat till tolvsiffrigt format.</p>