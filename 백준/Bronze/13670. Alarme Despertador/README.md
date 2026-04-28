# [Bronze III] Alarme Despertador - 13670

[문제 링크](https://www.acmicpc.net/problem/13670)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 331, 정답: 282, 맞힌 사람: 259, 정답 비율: 87.797%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Daniela &eacute; enfermeira em um grande hospital, e tem os hor&aacute;rios de trabalho muito vari&aacute;veis. Para piorar, ela tem sono pesado, e uma grande dificuldade para acordar com rel&oacute;gios despertadores.</p>

<p>Recentemente ela ganhou de presente um rel&oacute;gio digital, com alarme com v&aacute;rios tons, e tem esperan&ccedil;a que isso resolva o seu problema. No entanto, ela anda muito cansada e quer aproveitar cada momento de descanso. Por isso, carrega seu rel&oacute;gio digital despertador para todos os lugares, e sempre que tem um tempo de descanso procura dormir, programando o alarme despertador para a hora em que tem que acordar. No entanto, com tanta ansiedade para dormir, acaba tendo dificuldades para adormecer e aproveitar o descanso.</p>

<p>Um problema que a tem atormentado na hora de dormir &eacute; saber quantos minutos ela teria de sono se adormecesse imediatamente e acordasse somente quando o despertador tocasse. Mas ela realmente n&atilde;o &eacute; muito boa com n&uacute;meros, e pediu sua ajuda para escrever um programa que, dada a hora corrente e a hora do alarme, determine o n&uacute;mero de minutos que ela poderia dormir.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. Cada caso de teste &eacute; descrito em uma linha, contendo quatro n&uacute;meros inteiros H<sub>1</sub>&nbsp;, M<sub>1</sub>&nbsp;, H<sub>2</sub>&nbsp;e M<sub>2</sub>, com H<sub>1</sub>:M<sub>1</sub>&nbsp;representando a hora e minuto atuais, e H<sub>2</sub>:M<sub>2</sub>&nbsp;representando a hora e minuto para os quais o alarme&nbsp; despertador foi programado (0 &le; H<sub>1</sub> &le; 23, 0 &le; M<sub>1</sub> &le; 59, 0 &le; H<sub>2</sub> &le; 23, 0 &le; M<sub>2</sub> &le; 59).</p>

<p>O final da entrada &eacute; indicado por uma linha que cont&eacute;m apenas quatro zeros, separados por espa&ccedil;os em branco.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve imprimir uma linha, cada uma contendo um n&uacute;mero inteiro, indicando o n&uacute;mero de minutos que Daniela tem para dormir.</p>