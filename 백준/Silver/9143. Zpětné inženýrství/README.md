# [Silver II] Zpětné inženýrství - 9143

[문제 링크](https://www.acmicpc.net/problem/9143)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 25, 맞힌 사람: 17, 정답 비율: 70.833%

### 분류

수학, 정수론

### 문제 설명

<p>Policistům se ned&aacute;vno podařilo zachytit fragment zdrojov&eacute;ho k&oacute;du, kter&yacute; si mezi sebou před&aacute;valy anarchistick&eacute; skupiny&nbsp;<em>MCA</em>&nbsp;a&nbsp;<em>MBI</em>. Tento fragment můžete vidět n&iacute;že, pro přehlednost je kromě původn&iacute;ho jazyka (anarchist&eacute; použ&iacute;vaj&iacute; z&aacute;sadně&nbsp;<em>C</em>) uveden tak&eacute; přepis do jazyka&nbsp;<em>Pascal</em>.</p>

<pre class="brush:c++;">
int main()
{ int u,v,k,t ;
  scanf(&quot;%d %d&quot;,&amp;u,&amp;v) ;
  for (k=0;!(u%2)&amp;&amp;!(v%2);k++)
    { u/=2 ; v/=2 ; }
  if (u%2) t=-v ; 
  else t=u/2 ;
  while(t) {
    while(!(t%2)) t/=2 ;
    if (t&gt;0) u=t ; else v=-t ;
    t=u-v ; 
  }
  while(k--&gt;0) u*=2 ; 
  printf(&quot;%d\n&quot;,u) ;
  return 0 ;
}
</pre>

<pre class="brush:pascal;">
program zahada;
var u,v,k,t:integer;
begin
  readln(u,v); k:=0;
  while(u mod 2=0)and(v mod 2=0) do
    begin u:=u div 2; v:=v div 2; k:=k+1; end;
  if(u mod 2&lt;&gt;0) then t:=-v
  else t:=u div 2;
  while(t&lt;&gt;0) do begin
    while(t mod 2=0) do t:=t div 2;
    if(t&gt;0) then u:=t else v:=-t;
    t:=u-v;
  end;
  while(k&gt;0) do begin u:=u*2; k:=k-1; end;
  writeln(u:1);
end.
</pre>

<p>Na prvn&iacute; pohled je zřejm&eacute;, že program čte ze vstupu dvě č&iacute;sla, pro kter&aacute; spoč&iacute;t&aacute; nějak&yacute; v&yacute;sledek. Bohužel se v&scaron;ak dosud nepodařilo proniknout do tajů v&yacute;početn&iacute;ho procesu, a tak nev&iacute;me přesně, jak&aacute; je souvislost mezi vstupem a v&yacute;stupem. Pro přehlednost si v&scaron;ak realizovanou funkci označ&iacute;me jako&nbsp;<var>f</var>. Definičn&iacute;m oborem t&eacute;to funkce bude množina cel&yacute;ch kladn&yacute;ch č&iacute;sel. Nechť&nbsp;<var>f</var>(<var>a</var>,<var>b</var>) je hodnota, kterou program vyp&iacute;&scaron;e, pokud na jeho vstup zad&aacute;me cel&aacute; č&iacute;sla&nbsp;<var>a</var>&nbsp;a&nbsp;<var>b</var>. Jestliže program neskonč&iacute; nebo skonč&iacute; s&nbsp;chybou, nen&iacute; hodnota&nbsp;<var>f</var>(<var>a</var>,<var>b</var>) pro př&iacute;slu&scaron;n&yacute; vstup definov&aacute;na. Abychom mohli chov&aacute;n&iacute; funkce l&eacute;pe sledovat, je třeba vytvořit funkci inverzn&iacute;, tedy nal&eacute;zt takov&aacute; č&iacute;sla&nbsp;<var>a</var>&nbsp;a&nbsp;<var>b</var>, pro kter&aacute; je&nbsp;<var>f</var>(<var>a</var>,<var>b</var>) rovno předem dan&eacute; hodnotě.</p>

### 입력

<p>Prvn&iacute; ř&aacute;dek vstupn&iacute;ho souboru obsahuje cel&eacute; kladn&eacute; č&iacute;slo&nbsp;<var>Z</var>, za kter&yacute;m n&aacute;sleduje postupně&nbsp;<var>Z</var>zad&aacute;n&iacute;. Každ&eacute; zad&aacute;n&iacute; je tvořeno jedin&yacute;m ř&aacute;dkem obsahuj&iacute;c&iacute;m dvě cel&aacute; č&iacute;sla&nbsp;<var>N</var>&nbsp;a&nbsp;<var>M</var>, 0 &lt;&nbsp;<var>N</var>,<var>M</var>&lt;= 1000000. Č&iacute;sla jsou oddělena mezerou.</p>

### 출력

<p>Pro každ&eacute; zad&aacute;n&iacute; vyp&iacute;&scaron;e program na v&yacute;stup jedin&yacute; ř&aacute;dek se dvěma č&iacute;sly&nbsp;<var>U</var>&nbsp;a&nbsp;<var>V</var>&nbsp;oddělen&yacute;mi mezerou. Tato č&iacute;sla mus&iacute; splňovat podm&iacute;nku 1 &lt;=&nbsp;<var>V</var>&nbsp;&lt;&nbsp;<var>U</var>&nbsp;&lt;&nbsp;<var>N</var>. Jestliže existuje v&iacute;ce dvojic vyhovuj&iacute;c&iacute;ch zad&aacute;n&iacute;, vypi&scaron;te ten př&iacute;pad, kdy je&nbsp;<var>U</var>&nbsp;maxim&aacute;ln&iacute;. Pokud existuje v&iacute;ce ře&scaron;en&iacute; se stejn&yacute;m maxim&aacute;ln&iacute;m&nbsp;<var>U</var>, vypi&scaron;te to, kdy je maxim&aacute;ln&iacute;&nbsp;<var>V</var>. Jestliže neexistuje ž&aacute;dn&aacute; dvojice č&iacute;sel, kter&aacute; by zad&aacute;n&iacute; vyhověla, vypi&scaron;te na ř&aacute;dek větu &quot;<code>Reseni neexistuje.</code>&quot;.</p>