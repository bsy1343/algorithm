# [Bronze II] Loop Musical - 13682

[문제 링크](https://www.acmicpc.net/problem/13682)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 146, 정답: 125, 맞힌 사람: 100, 정답 비율: 86.957%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Um&nbsp;loop musical &eacute; um trecho de m&uacute;sica que foi composto para repetir continuamente (ou seja, o trecho inicia novamente toda vez que chega ao final), sem que se note descontinuidade. Loops s&atilde;o muito usados na sonoriza&ccedil;&atilde;o de jogos, especialmente jogos casuais pela internet.</p>

<p>Loops podem ser digitalizados por exemplo utilizando PCM. PCM, do ingl&ecirc;s Pulse Code Modulation, &eacute; uma t&eacute;cnica para representa&ccedil;&atilde;o de sinais anal&oacute;gicos, muito utilizada em &aacute;udio digital. Nessa t&eacute;cnica, a magnitude do sinal &eacute; amostrada a intervalos regulares de tempo, e os valores amostrados s&atilde;o armazenados em sequ&ecirc;ncia. Para reproduzir a forma de onda amostrada, o processo &eacute; invertido (demodula&ccedil;&atilde;o).</p>

<p>Fernandinha trabalha para uma empresa que desenvolve jogos e comp&ocirc;s um bonito loopmusical, codificando-o em PCM. Analisando a forma de onda do seu loop em um software de edi&ccedil;&atilde;o de &aacute;udio, Fernandinha ficou curiosa ao notar a quantidade de &ldquo;picos&rdquo; existentes. Um pico em uma forma de onda &eacute; um valor de uma amostra que representa um m&aacute;ximo ou m&iacute;nimo local, ou seja, um ponto de inflex&atilde;o da forma de onda. A figura abaixo ilustra (a) um exemplo de forma de onda e (b) o loop formado com essa forma de onda, contendo 48 picos.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/13682.%E2%80%85Loop%E2%80%85Musical/cb13473a.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/13682.%E2%80%85Loop%E2%80%85Musical/cb13473a.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13682/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-12%20%EC%98%A4%EC%A0%84%207.53.00.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:284px; width:433px" /></p>

<p>Fernandinha &eacute; uma amiga muito querida e pediu sua ajuda para determinar quantos picos existem no seu loop musical.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira linha de um caso de teste cont&eacute;m um inteiro&nbsp;N, representando o n&uacute;mero de amostras no loop musical de Fernandinha (2 &le; N &le; 10<sup>4</sup>). A segunda linha cont&eacute;m&nbsp;N&nbsp;inteiros&nbsp;H<sub>i</sub>, separados por espa&ccedil;os, representando a sequ&ecirc;ncia de magnitudes das amostras(-10<sup>4</sup>&nbsp;&le; H<sub>i</sub>&nbsp;&le; 10<sup>4</sup>&nbsp;para&nbsp;1 &le; i &le; N,&nbsp;H<sub>1</sub>&nbsp;&ne; H<sub>N</sub>&nbsp;e&nbsp;H<sub>i</sub>&nbsp;&ne; H<sub>i+1</sub>&nbsp;para&nbsp;1 &le; i &lt; N). Note que&nbsp;H<sub>1</sub>&nbsp;segue&nbsp;H<sub>N</sub>&nbsp;quando o loop &eacute; reproduzido.</p>

<p>O final da entrada &eacute; indicado por uma linha que cont&eacute;m apenas o n&uacute;mero zero.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve imprimir uma &uacute;nica linha, contendo apenas um inteiro, o n&uacute;mero de picos existentes no loop musical de Fernandinha.</p>