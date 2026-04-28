# [Silver I] Trevliga tal - 26914

[문제 링크](https://www.acmicpc.net/problem/26914)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 8, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

수학, 다이나믹 프로그래밍

### 문제 설명

<p>Det svenska juniorlandslaget i programmering &auml;lskar att ha det trevligt n&auml;r de &auml;r ute och reser. En som uppskattade trevlighet mer &auml;n n&aring;gon annan var M&aring;rten. Han hade dock inte samma bild av trevlighet som alla andra. F&ouml;r M&aring;rten hade trevlighet en rent matematisk definition: ett visst tal &auml;r trevligt om och endast om det &auml;r delbart med 3.</p>

<p>Eftersom inte alla tal &auml;r trevliga s&aring; m&aring;ste man f&ouml;rst&aring;s hitta s&auml;tt att g&ouml;ra dem trevliga p&aring;. Du kommer att f&aring; ett heltal, och ditt uppdrag &auml;r att hj&auml;lpa M&aring;rten r&auml;kna ut p&aring; hur m&aring;nga s&auml;tt han kan g&ouml;ra talet trevligt genom att stryka vissa av siffrorna i talet. Han f&aring;r dock inte stryka alla siffrorna och det resulterande talet f&aring;r inte ha inledande nollor (dock anses talet $0$ vara trevligt, s&aring; en ensam nolla &auml;r okej). Kom ih&aring;g att ett tal &auml;r delbart med tre om och endast om dess siffersumma &auml;r delbar med tre.</p>

### 입력

<p>P&aring; den f&ouml;rsta och enda raden i indata st&aring;r ett heltal (med upp till $100\,000$ siffror). Talet inneh&aring;ller endast siffror $0$-$9$. Talet b&ouml;rjar inte med en nolla.</p>

### 출력

<p>Ditt program ska skriva ut ett enda tal p&aring; en rad: antalet olika s&auml;tt p&aring; vilket M&aring;rten kan ta bort siffror ur talet s&aring; att det blir delbart med $3$. Tv&aring; s&auml;tt anses vara olika om indexen d&auml;r siffror tagits bort skiljer sig. Eftersom svaret kan bli j&auml;ttestort s&aring; ska du ska du skriva ut <em>resten</em> som uppst&aring;r d&aring; svaret divideras med en miljard. </p>

### 힌트

<p>F&ouml;rklaring av exempelfall 1: M&aring;rten kan &aring;stadkomma delbarhet p&aring; ett s&auml;tt, genom att stryka ettan i talet. Kvar blir d&aring; bara talet 3, som f&ouml;rst&aring;s &auml;r delbart med tre.</p>

<p>F&ouml;rklaring av exempelfall 2: M&aring;rten &aring;stadkommer delbarhet genom att inte stryka n&aring;gon siffra alls.</p>

<p>F&ouml;rklaring av exempelfall 3: det g&aring;r inte att skapa ett trevligt tal oavsett vad M&aring;rten g&ouml;r.</p>

<p>F&ouml;rklaring av exempelfall 4: det g&aring;r att skapa de trevliga talen 9, 192, 912 och 12, men det sistn&auml;mnda kan &aring;stadkommas p&aring; tv&aring; s&auml;tt: genom att stryka de tv&aring; f&ouml;rsta siffrorna eller genom att stryka de tv&aring; mittersta siffrorna.</p>

<p>F&ouml;rklaring av exempelfall 5: det g&aring;r att skapa de trevliga talen 0, 3, 12, 102, 123 och 1023.</p>