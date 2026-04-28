# [Bronze II] huaauhahhuahau - 13587

[문제 링크](https://www.acmicpc.net/problem/13587)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 245, 정답: 208, 맞힌 사람: 185, 정답 비율: 87.678%

### 분류

구현, 문자열

### 문제 설명

<p>Em chats, &eacute; muito comum entre jovens e adolescentes utilizar sequ&ecirc;ncias de letras, que parecem muitas vezes aleat&oacute;rias, para representar risadas. Alguns exemplos comuns s&atilde;o:</p>

<pre>
h<code>uaauhahhuahau
hehehehe
ahahahaha
jaisjjkasjksjjskjakijs
huehuehue</code></pre>

<p>Cl&aacute;udia &eacute; uma jovem programadora que ficou intrigada pela sonoridade das &ldquo;risadas digitais&rdquo;. Algumas delas ela nem mesmo consegue pronunciar! Mas ela percebeu que algumas delas parecem transmitir melhor o sentimento da risada que outras. A primeira coisa que ela percebeu &eacute; que as consoantes n&atilde;o interferem no quanto as risadas digitais influenciam na transmiss&atilde;o do sentimento. A segunda coisa que ela percebeu &eacute; que as risadas digitais mais engra&ccedil;adas s&atilde;o aquelas em que as sequ&ecirc;ncias de vogais s&atilde;o iguais quando lidas na ordem natural (da esquerda para a direita) ou na ordem inversa (da direita para a esquerda), ignorando as consoantes. Por exemplo, &ldquo;hahaha&rdquo; e &ldquo;huaauhahhuahau&rdquo; est&atilde;o entre as risadas mais engra&ccedil;adas, enquanto &ldquo;riajkjdhhihhjak&rdquo; e &ldquo;huehuehue&rdquo; n&atilde;o est&atilde;o entre as mais engra&ccedil;adas.</p>

<p>Cl&aacute;udia est&aacute; muito atarefada com a an&aacute;lise estat&iacute;stica das risadas digitais e pediu sua ajuda para escrever um programa que determine, para uma risada digital, se ela &eacute; das mais engra&ccedil;adas ou n&atilde;o.</p>

### 입력

<p>A entrada &eacute; composta por uma linha, contendo uma sequ&ecirc;ncia de no m&aacute;ximo 50 caracteres, formada apenas por letras min&uacute;sculas sem acentua&ccedil;&atilde;o. As vogais s&atilde;o as letras &lsquo;a&rsquo;,&lsquo;e&rsquo;,&lsquo;i&rsquo;,&lsquo;o&rsquo;,&lsquo;u&rsquo;. A sequ&ecirc;ncia cont&eacute;m pelo menos uma vogal.</p>

<p>&nbsp;</p>

### 출력

<p>Seu programa deve produzir uma linha contendo um caractere, &ldquo;S&rdquo; caso a risada seja das mais engra&ccedil;adas, ou &ldquo;N&rdquo; caso contr&aacute;rio.</p>